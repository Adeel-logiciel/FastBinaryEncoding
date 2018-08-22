'use strict'

const test = require('tape')

const fbe = require('../proto/fbe')
const proto = require('../proto/proto')

test('Create & access', function (t) {
  // Create a new account using FBE model into the FBE stream
  let writer = new proto.AccountModel(new fbe.WriteBuffer())
  t.equal(writer.model.FBEOffset, 4)
  let modelBegin = writer.createBegin()
  let accountBegin = writer.model.setBegin()
  writer.model.uid.set(1)
  writer.model.name.set('Test')
  writer.model.state.set(proto.State.good)
  let walletBegin = writer.model.wallet.setBegin()
  writer.model.wallet.currency.set('USD')
  writer.model.wallet.amount.set(1000.0)
  writer.model.wallet.setEnd(walletBegin)
  let assetBegin = writer.model.asset.setBegin(true)
  let assetWalletBegin = writer.model.asset.value.setBegin()
  writer.model.asset.value.currency.set('EUR')
  writer.model.asset.value.amount.set(100.0)
  writer.model.asset.setEnd(assetBegin)
  writer.model.asset.value.setEnd(assetWalletBegin)
  let order = writer.model.orders.resize(3)
  let orderBegin = order.setBegin()
  order.uid.set(1)
  order.symbol.set('EURUSD')
  order.side.set(proto.OrderSide.buy)
  order.type.set(proto.OrderType.market)
  order.price.set(1.23456)
  order.volume.set(1000.0)
  order.setEnd(orderBegin)
  order.FBEShift(order.FBESize)
  orderBegin = order.setBegin()
  order.uid.set(2)
  order.symbol.set('EURUSD')
  order.side.set(proto.OrderSide.sell)
  order.type.set(proto.OrderType.limit)
  order.price.set(1.0)
  order.volume.set(100.0)
  order.setEnd(orderBegin)
  order.FBEShift(order.FBESize)
  orderBegin = order.setBegin()
  order.uid.set(3)
  order.symbol.set('EURUSD')
  order.side.set(proto.OrderSide.buy)
  order.type.set(proto.OrderType.stop)
  order.price.set(1.5)
  order.volume.set(10.0)
  order.setEnd(orderBegin)
  order.FBEShift(order.FBESize)
  writer.model.setEnd(accountBegin)
  let serialized = writer.createEnd(modelBegin)
  t.equal(serialized, writer.buffer.size)
  t.true(writer.verify())
  writer.next(serialized)
  t.equal(writer.model.FBEOffset, (4 + writer.buffer.size))

  // Check the serialized FBE size
  t.equal(writer.buffer.size, 252)

  // Access the account model in the FBE stream
  let reader = new proto.AccountModel(new fbe.ReadBuffer())
  t.equal(reader.model.FBEOffset, 4)
  reader.attachBuffer(writer.buffer)
  t.true(reader.verify())

  accountBegin = reader.model.getBegin()
  let uid = reader.model.uid.get()
  t.equal(uid, 1)
  let name = reader.model.name.get()
  t.equal(name, 'Test')
  let state = reader.model.state.get()
  t.true(state.hasFlags(proto.State.good))

  walletBegin = reader.model.wallet.getBegin()
  let walletCurrency = reader.model.wallet.currency.get()
  t.equal(walletCurrency, 'USD')
  let walletAmount = reader.model.wallet.amount.get()
  t.equal(walletAmount, 1000.0)
  reader.model.wallet.getEnd(walletBegin)

  t.true(reader.model.asset.hasValue)
  assetBegin = reader.model.asset.getBegin()
  assetWalletBegin = reader.model.asset.value.getBegin()
  let assetWalletCurrency = reader.model.asset.value.currency.get()
  t.equal(assetWalletCurrency, 'EUR')
  let assetWalletAmount = reader.model.asset.value.amount.get()
  t.equal(assetWalletAmount, 100.0)
  reader.model.asset.value.getEnd(assetWalletBegin)
  reader.model.asset.getEnd(assetBegin)

  t.equal(reader.model.orders.size, 3)

  let o1 = reader.model.orders.getItem(0)
  orderBegin = o1.getBegin()
  let orderUid = o1.uid.get()
  t.equal(orderUid, 1)
  let orderSymbol = o1.symbol.get()
  t.equal(orderSymbol, 'EURUSD')
  let orderSide = o1.side.get()
  t.true(orderSide.eq(proto.OrderSide.buy))
  let orderType = o1.type.get()
  t.true(orderType.eq(proto.OrderType.market))
  let orderPrice = o1.price.get()
  t.equal(orderPrice, 1.23456)
  let orderVolume = o1.volume.get()
  t.equal(orderVolume, 1000.0)
  o1.getEnd(orderBegin)

  let o2 = reader.model.orders.getItem(1)
  orderBegin = o2.getBegin()
  orderUid = o2.uid.get()
  t.equal(orderUid, 2)
  orderSymbol = o2.symbol.get()
  t.equal(orderSymbol, 'EURUSD')
  orderSide = o2.side.get()
  t.true(orderSide.eq(proto.OrderSide.sell))
  orderType = o2.type.get()
  t.true(orderType.eq(proto.OrderType.limit))
  orderPrice = o2.price.get()
  t.equal(orderPrice, 1.0)
  orderVolume = o2.volume.get()
  t.equal(orderVolume, 100.0)
  o1.getEnd(orderBegin)

  let o3 = reader.model.orders.getItem(2)
  orderBegin = o3.getBegin()
  orderUid = o3.uid.get()
  t.equal(orderUid, 3)
  orderSymbol = o3.symbol.get()
  t.equal(orderSymbol, 'EURUSD')
  orderSide = o3.side.get()
  t.true(orderSide.eq(proto.OrderSide.buy))
  orderType = o3.type.get()
  t.true(orderType.eq(proto.OrderType.stop))
  orderPrice = o3.price.get()
  t.equal(orderPrice, 1.5)
  orderVolume = o3.volume.get()
  t.equal(orderVolume, 10.0)
  o1.getEnd(orderBegin)

  reader.model.getEnd(accountBegin)
  t.end()
})
