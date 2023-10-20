package tests

import (
	"code/src"
	"testing"
)

func TestTicTacTo1(t *testing.T) {
	expected := 1
	board := []string{
		"O.X",
		".O.",
		"..X",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}

func TestTicTacTo2(t *testing.T) {
	expected := 0
	board := []string{
		"OOO",
		"...",
		"XXX",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}

func TestTicTacTo3(t *testing.T) {
	expected := 0
	board := []string{
		"...",
		".X.",
		"...",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}

func TestTicTacTo4(t *testing.T) {
	expected := 1
	board := []string{
		"...",
		"...",
		"...",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}
func TestTicTacTo5(t *testing.T) {
	expected := 0
	board := []string{
		"O.X",
		"O..",
		"OXX",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}
func TestTicTacTo6(t *testing.T) {
	expected := 0
	board := []string{
		"O.X",
		".O.",
		"XXO",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}
func TestTicTacTo7(t *testing.T) {
	expected := 0
	board := []string{
		"X.O",
		".O.",
		"OXX",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}
func TestTicTacTo8(t *testing.T) {
	expected := 0
	board := []string{
		"OOX",
		".X.",
		"XOO",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}

func TestTicTacTo9(t *testing.T) {
	expected := 1
	board := []string{
		"X.O",
		"XO.",
		"X.O",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}

func TestTicTacT10(t *testing.T) {
	expected := 0
	board := []string{
		"OOO",
		"XXX",
		"X..",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}

func TestTicTacT11(t *testing.T) {
	expected := 0
	board := []string{
		"O..",
		"OOO",
		"XXX",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}

func TestTicTacT12(t *testing.T) {
	expected := 1
	board := []string{
		".OX",
		".XO",
		"X.O",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}

func TestTicTacTo13(t *testing.T) {
	expected := 0
	board := []string{
		"X.O",
		"X.O",
		"X.O",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}

func TestTicTacTo14(t *testing.T) {
	expected := 0
	board := []string{
		"X..",
		"X.O",
		"X.O",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}

func TestTicTacTo15(t *testing.T) {
	expected := 1
	board := []string{
		"O..",
		"XO.",
		"X.O",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}

func TestTicTacTo16(t *testing.T) {
	expected := 0
	board := []string{
		"O.X",
		"XO.",
		"X.O",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}

func TestTicTacTo17(t *testing.T) {
	expected := 0
	board := []string{
		"OOO",
		"OOO",
		"OOO",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}

func TestTicTacTo18(t *testing.T) {
	expected := 0
	board := []string{
		"XXX",
		"XXX",
		"XXX",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}

func TestTicTacTo19(t *testing.T) {
	expected := 1
	board := []string{
		"OXO",
		"XOO",
		"OXX",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}

func TestTicTacTo20(t *testing.T) {
	expected := 1
	board := []string{
		"OXO",
		"XOX",
		"OXO",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}

func TestTicTacTo21(t *testing.T) {
	expected := 1
	board := []string{
		"OOO",
		"OXX",
		"OXX",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}

func TestTicTacTo22(t *testing.T) {
	expected := 1
	board := []string{
		"XXO",
		"OOO",
		"XXO",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}

func TestTicTacTo23(t *testing.T) {
	expected := 1
	board := []string{
		"XXO",
		"XOO",
		"OXO",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}

func TestTicTacTo24(t *testing.T) {
	expected := 1
	board := []string{
		"OXX",
		"OOO",
		"XXO",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}

func TestTicTacTo25(t *testing.T) {
	expected := 1
	board := []string{
		"OXX",
		"XOO",
		"OX.",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}

func TestTicTacTo26(t *testing.T) {
	expected := 1
	board := []string{
		"OXO",
		"XOX",
		"OXO",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}

func TestTicTacTo27(t *testing.T) {
	expected := 0
	board := []string{
		"OOO",
		"OOX",
		"XXX",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}

func TestTicTacTo28(t *testing.T) {
	expected := 0
	board := []string{
		"OOO",
		"O..",
		"XXX",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}

func TestTicTacTo29(t *testing.T) {
	expected := 0
	board := []string{
		"OOX",
		"OXO",
		"XOO",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}

func TestTicTacTo30(t *testing.T) {
	expected := 0
	board := []string{
		"OO.",
		"...",
		"...",
	}
	result := src.Solution(board)
	if expected != result {
		t.Fatalf("Expected %d, but got %d", expected, result)
	}
}
