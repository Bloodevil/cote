const data = [2345,23425];

let biggest=0;

const arr = data.split('\n\n');

const sum = calorieList => {
    const calories = calorieList.split(' ').forEach(cal => Number(cal));
    return calories.reduce(function(a, b){ return a + b; }, 0);
}


for (let i = 0; i < arr.length; i++){
    if (biggest < sum(arr[i])) {
        biggest = sum(arr[i]);
    }
}