const trafficCalculator = (lines) => {
  let answer = 0

  const converted = lines.reduce((prev, line) => {
    const times = line.split(' ')
    const end = new Date(
      times.slice(0,2).join(' ')
    ).getTime()
    const duration = times[2].replace(/\w$/g, '') * 1000
    const start = end - (duration - 1)

    return {
      ...prev,
      [start]: end
    }
  }, {})

  const starts = Object.keys(converted)
  const ends = Object.values(converted)

  Object.entries(converted).forEach(([start, end]) => {
    const startPeriod = Number(start) + 999
    const endPeriod = end + 999

    const countByStartPeriod = starts.filter(
      (_start) => (
        (Number(_start) >= Number(start) && Number(_start) <= startPeriod)
        || (Number(_start) >= Number(end) && Number(_start) <= endPeriod))
    ).length
    const countByEndPeriod = ends.filter(
      (_end) => (
        (_end >= start && _end <= startPeriod)
        || (_end >= end && _end <= endPeriod))
    ).length

    answer = Math.max(answer, countByStartPeriod, countByEndPeriod)
  })

  return answer
}

const line1 = [
  "2016-09-15 01:00:04.001 2.0s",
  "2016-09-15 01:00:07.000 2s",
]

const line2 = [
  "2016-09-15 01:00:04.002 2.0s",
  "2016-09-15 01:00:07.000 2s",
]

const line3 = [
  "2016-09-15 20:59:57.421 0.351s",
  "2016-09-15 20:59:58.233 1.181s",
  "2016-09-15 20:59:58.299 0.8s",
  "2016-09-15 20:59:58.688 1.041s",
  "2016-09-15 20:59:59.591 1.412s",
  "2016-09-15 21:00:00.464 1.466s",
  "2016-09-15 21:00:00.741 1.581s",
  "2016-09-15 21:00:00.748 2.31s",
  "2016-09-15 21:00:00.966 0.381s",
  "2016-09-15 21:00:02.066 2.62s",
]

console.log(`Example 1: ${trafficCalculator(line1)}`)
console.log(`Example 2: ${trafficCalculator(line2)}`)
console.log(`Example 3: ${trafficCalculator(line3)}`)
