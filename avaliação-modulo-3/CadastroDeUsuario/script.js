const reset = () => {
    let input = document.querySelector('input');
    input.value = '';
}

const getInputValue = () => {
    const input = document.querySelector('input').value;
    if(input === '') return;
    insertRegister(input);
};

const insertRegister = (value) => {
    const list = document.querySelector('ul');
    const item = document.createElement('li');
    item.innerText = value + ' ';
    list.appendChild(item);
    insertRemover(item);
}

const insertRemover = (item) => {
    const removeButton = document.createElement('button')
    removeButton.innerText = "Remove";
    removeButton.onclick = () => item.remove();
    item.appendChild(removeButton);
} 

const save = document.querySelector('button[type="submit"]')
save.onclick = function(event) {
    getInputValue();
}

const form = document.querySelector('form');
form.addEventListener('submit', function(event) {
    reset();
    event.preventDefault();
})