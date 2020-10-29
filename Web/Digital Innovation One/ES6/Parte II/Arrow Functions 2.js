(() => {
    this.name = 'Arrow Function';   
    const getNameArrowFn = () => this.name;  // Atribui por arrow function o this.name ('Arrow Function') em getNameArrowFn 
    
    function getName() {
        return this.name; // o this irá referenciar a função em getName içada abaixo
    }
    
    const user = {   // memoriza valores para serem acessados  tanto por getNameArrowFn quanto getName
        name: 'Nome no objeto de execução',
        getNameArrowFn, // ou getNameArrowFn: getNameArrowFn,   // já atribuido no arrowfunction acima
        getName         // ou getName: getName                  // acabou de ser atribuido na variavel em name
    }
    
    console.log(user.getNameArrowFn());
    console.log(user.getName());

})();
