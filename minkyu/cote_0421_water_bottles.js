const numWaterBottles = (numBottles, numExchange) => {
  if (numBottles < numExchange) {
      return numBottles
  }
  
  const exchangeableBottles = Math.floor(numBottles / numExchange)
  const emptyBottles = numBottles % numExchange
  return numBottles + numWaterBottles(exchangeableBottles + emptyBottles, numExchange) - emptyBottles
}
