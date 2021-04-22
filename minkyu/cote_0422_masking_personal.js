const generateStar = (num) => {
  let stars = ''
  for (let i = 0; i < num; i++) {
      stars += '*'
  }
  return stars ? `+${stars}-` : stars
} 

const maskPII = (S) => {
  const isEmail = S.match(/^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$/g)

  let mask = ''
  switch(true) {
      case !!isEmail:
          const [first, last] = S.split('@')
          const lastIdx = first.length - 1
          mask = `${first[0]}*****${first[lastIdx]}@${last}`
          break
      default:
          const numbers = S.replace(/\D/g, '')
          const digits = numbers.length
          const preMasked = `***-***-${numbers.slice(-4)}`
          mask = `${generateStar(digits - 10)}${preMasked}`
          break
  }
  
  return mask.toLowerCase()
}
