function isAnagram(s: string, t: string): boolean {
  if (s.length !== t.length) return false;

  const tArr = t.split("");

  for (let i = 0; i < s.length; i++) {
    const idx = tArr.indexOf(s[i]);
    if (idx < 0) return false;

    tArr.splice(idx, 1);
  }

  return !tArr.length;
}
