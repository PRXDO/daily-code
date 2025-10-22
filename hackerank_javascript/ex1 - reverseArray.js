
const numbers = [1,2,3]

function reverseArray(array){

    const reversedArray = [];
    let arraylen = array.length - 1;

    for ( let i = arraylen; i >= 0; i--){
        reversedArray.push(array[i])
    }
    
    return reversedArray;
}

console.log(numbers);

console.log(reverseArray(numbers));