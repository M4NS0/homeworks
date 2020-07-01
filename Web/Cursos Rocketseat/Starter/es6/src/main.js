// lê se '=>' que retorna
const minhaPromisse = () => new Promisse((resolve, reject) => { setTimeout(() => { resolve('Ok') }, 2000);
});

minhaPromisse.then(response => {
    console.log(response);
});
