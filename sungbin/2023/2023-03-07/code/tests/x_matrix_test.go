package tests

import (
	"code/src"
	"testing"
)

func TestGrid1(t *testing.T) {
	grid := [][]int{{2, 0, 0, 1}, {0, 3, 1, 0}, {0, 5, 2, 0}, {4, 0, 0, 2}}
	expected := true
	result := src.CheckXMatrix(grid)
	if expected != result {
		t.Fatalf("Expected %t, but got %t", expected, result)
	}
}

func TestGrid2(t *testing.T) {
	grid := [][]int{{5, 7, 0}, {0, 3, 1}, {0, 5, 0}}
	expected := false
	result := src.CheckXMatrix(grid)
	if expected != result {
		t.Fatalf("Expected %t, but got %t", expected, result)
	}
}

func TestGrid3(t *testing.T) {
	grid := [][]int{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}
	expected := false
	result := src.CheckXMatrix(grid)
	if expected != result {
		t.Fatalf("Expected %t, but got %t", expected, result)
	}
}

func TestGrid4(t *testing.T) {
	grid := [][]int{{0, 0, 1}, {0, 1, 0}, {1, 0, 0}}
	expected := false
	result := src.CheckXMatrix(grid)
	if expected != result {
		t.Fatalf("Expected %t, but got %t", expected, result)
	}
}
func TestGrid5(t *testing.T) {
	grid := [][]int{{0, 0, 0}, {1, 1, 1}, {0, 0, 0}}
	expected := false
	result := src.CheckXMatrix(grid)
	if expected != result {
		t.Fatalf("Expected %t, but got %t", expected, result)
	}
}

func TestGrid6(t *testing.T) {
	grid := [][]int{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}}
	expected := false
	result := src.CheckXMatrix(grid)
	if expected != result {
		t.Fatalf("Expected %t, but got %t", expected, result)
	}
}

func TestGrid7(t *testing.T) {
	grid := [][]int{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}}
	expected := false
	result := src.CheckXMatrix(grid)
	if expected != result {
		t.Fatalf("Expected %t, but got %t", expected, result)
	}
}
