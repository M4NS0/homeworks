document
    .querySelector('.toggle')
    .addEventListener("click", (e) => {
        e.target.classList.toggle('toggle-light');
        e.target.classList.toggle('toggle-dark');
        document
            .querySelector('body')
            .classList
            .toggle('theme-dark');
    });