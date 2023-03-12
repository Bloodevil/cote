package src

func checkAreas(grid [][]int, areaIndex int, x1 int, y1 int, x2 int, y2 int) bool {
	for y := y1; y < y2; y++ {
		for x := x1; x < x2; x++ {
			number := grid[y][x]
			if ((areaIndex == 0 || areaIndex == 3) && ((x == y && number == 0) || (x != y && number != 0))) ||
				((areaIndex == 1 || areaIndex == 2) && ((x+y == len(grid)-1 && number == 0) || (x+y != len(grid)-1 && number != 0))) {
				return false
			}
		}
	}
	return true
}

func split(x1 int, y1 int, x2 int, y2 int) [][]int {
	MID_X, MID_Y := x1+(x2-x1)/2, y1+(y2-y1)/2
	areas := [][]int{
		{x1, y1, MID_X, MID_Y},
		{MID_X, y1, x2, MID_Y},
		{x1, MID_Y, MID_X, y2},
		{MID_X, MID_Y, x2, y2},
	}
	return areas
}

func CheckXMatrix(grid [][]int) bool {
	areas := split(0, 0, len(grid), len(grid))
	for areaIndex, area := range areas {
		isValid := checkAreas(grid, areaIndex, area[0], area[1], area[2], area[3])
		if !isValid {
			return false
		}
	}
	return true
}
