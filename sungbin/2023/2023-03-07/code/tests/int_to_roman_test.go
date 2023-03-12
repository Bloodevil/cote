package tests

import (
	"code/src"
	"testing"
)

func Test3(t *testing.T) {
	expected := "III"
	result := src.IntToRoman(3)
	if expected != result {
		t.Fatalf("Expected %s, but got %s", expected, result)
	}
}

func Test4(t *testing.T) {
	expected := "IV"
	result := src.IntToRoman(4)
	if expected != result {
		t.Fatalf("Expected %s, but got %s", expected, result)
	}
}

func Test5(t *testing.T) {
	expected := "V"
	result := src.IntToRoman(5)
	if expected != result {
		t.Fatalf("Expected %s, but got %s", expected, result)
	}
}
func Test9(t *testing.T) {
	expected := "IX"
	result := src.IntToRoman(9)
	if expected != result {
		t.Fatalf("Expected %s, but got %s", expected, result)
	}
}
func Test10(t *testing.T) {
	expected := "X"
	result := src.IntToRoman(10)
	if expected != result {
		t.Fatalf("Expected %s, but got %s", expected, result)
	}
}
func Test11(t *testing.T) {
	expected := "XI"
	result := src.IntToRoman(11)
	if expected != result {
		t.Fatalf("Expected %s, but got %s", expected, result)
	}
}
func Test14(t *testing.T) {
	expected := "XIV"
	result := src.IntToRoman(14)
	if expected != result {
		t.Fatalf("Expected %s, but got %s", expected, result)
	}
}
func Test15(t *testing.T) {
	expected := "XV"
	result := src.IntToRoman(15)
	if expected != result {
		t.Fatalf("Expected %s, but got %s", expected, result)
	}
}
func Test30(t *testing.T) {
	expected := "XXX"
	result := src.IntToRoman(30)
	if expected != result {
		t.Fatalf("Expected %s, but got %s", expected, result)
	}
}

func Test38(t *testing.T) {
	expected := "XXXVIII"
	result := src.IntToRoman(38)
	if expected != result {
		t.Fatalf("Expected %s, but got %s", expected, result)
	}
}
