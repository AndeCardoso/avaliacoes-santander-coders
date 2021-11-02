let values = [];

const getInputValue = () => {
    const inputValue = parseInt(document.querySelector('input').value);
    values.push(inputValue);
};

const resetInput = () => {
    const input = document.querySelector('input');
    input.value = '';
    input.focus();
}

const calculator = () => {
    const operator = document.querySelector('#operator').value;
    let equals = '';
    switch (operator){
        case 'sum':
            equals = values.reduce((acc, cur) => acc + cur);
            return equals;
        case 'minus':
            equals = values.reduce((acc, cur) => acc - cur);
            return equals;
        case 'multiply':
            equals = values.reduce((acc, cur) => acc * cur);
            return equals;
        case 'divide':
            equals = values.reduce((acc, cur) => acc / cur);
            return equals;
    }
}

const print = () => {
    const span = document.querySelector('span');
    span.innerText = calculator();
}

const printReset = () => {
    const span = document.querySelector('span');
    span.innerText = '';
}

const form = document.querySelector('form');
form.addEventListener('submit', function(event) {
    event.preventDefault();
    getInputValue();
    resetInput();
    printReset();
})

const equals = document.querySelector('#equals');

equals.onclick = function() {
    if(values.length < 2) return false
    print();
    values = [];
}