const button = document.querySelector('button');
const list = [];

button.onclick = function() {
  promisesGenerator.generateList();
}

const promisesGenerator = (() => {

  const createRandomArray = () => {
    const list = new Array(Math.floor(Math.random() * 10000));
    for (let i = 0; i < list.length; i++) {
      list.fill(Math.floor(Math.random() * 1000), i, i + 1)
    }
    return list
    
  }
  
  const createPromises = async () => {
    let interval = Math.floor(Math.random() * 100);
    const promiseList = await new Promise((resolve) => setTimeout(resolve, interval, createRandomArray()));
    return promiseList;
  }

  const generateList = async () => {
    const firstArray = await createPromises();
    const secondArray = await createPromises();
    const thirdArray = await createPromises();

    const list = document.querySelector('ul');
    
    fullList = Promise.allSettled([firstArray, secondArray, thirdArray])
    .then((result) => result.forEach((result) => {
      print(result);
    }))
  }

  const print = (values) => {
    let count = 0;
    const list = document.querySelector('ul');
    const item = document.createElement('li');
    for (const value of values.value) {
      const item = document.createElement('li');
      item.innerText = value;
      list.appendChild(item);
      count = count + 1;
    }
    const countValue = document.querySelector('span');
    countValue.innerText = `Essa lista possui o total de ${count} valores, resultado das 3 promises`;
  } 

  return {
    generateList
  }
})();