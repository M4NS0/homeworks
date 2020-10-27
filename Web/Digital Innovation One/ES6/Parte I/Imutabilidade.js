
// Imutabilidade

const user = {
    name: 'Jimmy',
    lastname: 'Hendrix'
};

function getUserWithFullName(user) {
    return {
        ...user,    // ... spread operator
        fullname: `${user.name} ${user.lastname}`  // string literal
    }
}

const userWithFullName = getUserWithFullName(user);
console.log(userWithFullName);