// lê se '=>' que retorna

const minhaPromise = () => new Promise((resolve, reject) => { setTimeout(() => { resolve('Ok') }, 2000);
});

// minhaPromise().then(response => {
//     console.log(response);
// });

// async function executaPromise() {
    
//     // const response = await minhaPromise();
//     // console.log(response);

//     console.log(await minhaPromise());
//     console.log(await minhaPromise());
//     console.log(await minhaPromise());

// }
// executaPromisse();

const executaPromise = async () => {
    console.log(await minhaPromise());
    console.log(await minhaPromise());
    console.log(await minhaPromise());

};
executaPromise();
