const flight_routes = (tickets) => {
  const routes = []

  // convert 'tickets' to an object
  const ticketObj = tickets.reduce((prevTicketObject, [depart, arrival]) => {
    return {
      ...prevTicketObject,
      [depart]: {
        ...prevTicketObject[depart],
        [arrival]: true,
      }
    }
  }, {})

  // set first departure airport to 'ICN'
  let departure = 'ICN'
  let isTravelEnded
  while (!isTravelEnded) {
    // add departure airport or last arrival airport to routes array
    routes.push(departure)

    // get next arrival airport
    // if there's more than one connections left, choose the first airport in alphabetical order
    const [nextArrival] = Object.keys(
      ticketObj[departure] || {}
    ).sort()

    if (nextArrival) {
      const {
        // de-structuring visited airport from object
        [nextArrival]: visited,
        ...otherCities
      } = ticketObj[departure]

      ticketObj[departure] = otherCities
      // reset the visited airport to the new departure airport
      departure = nextArrival
    } else {
      // all tickets are used
      isTravelEnded = true
    }
  }

  return routes
}

const tickets1 = [
  ['ICN', 'JFK'],
  ['HND', 'IAD'],
  ['JFK', 'HND'],
]

const tickets2 = [
  ['ICN', 'SFO'],
  ['ICN', 'ATL'],
  ['SFO', 'ATL'],
  ['ATL', 'ICN'],
  ['ATL', 'SFO']
]

console.log(`Example 1: ${JSON.stringify(flight_routes(tickets1), null, 2)}`)
console.log(`Example 2: ${JSON.stringify(flight_routes(tickets2), null, 2)}`)