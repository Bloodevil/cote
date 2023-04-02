package src

func Solution(board []string) int {
	var (
		count   = 0
		winners = make(map[string]bool)
		_map    = make(map[int]string)
	)

	for _, row := range board {
		if row == "OOO" || row == "XXX" {
			winners[row] = true
		}
		for x, block := range row {
			_, exists := _map[x]
			if !exists {
				_map[x] = string(board[0][x]) + string(board[1][x]) + string(board[2][x])
			}
			if block == 'O' {
				count++
			} else if block == 'X' {
				count--
			}
		}
	}

	_map[3] = string(board[0][0]) + string(board[1][1]) + string(board[2][2])
	_map[4] = string(board[0][2]) + string(board[1][1]) + string(board[2][0])

	for _, v := range _map {
		if v == "OOO" || v == "XXX" {
			winners[v] = true
		}
	}

	if count < 0 {
		return 0
	} else if count > 1 {
		return 0
	} else if len(winners) > 1 {
		return 0
	} else if winners["OOO"] && count != 1 {
		return 0
	} else if winners["XXX"] && count != 0 {
		return 0
	} else {
		return 1
	}
}
