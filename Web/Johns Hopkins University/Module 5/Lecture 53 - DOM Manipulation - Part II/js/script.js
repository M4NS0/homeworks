/*
function sayHello() {
    console.log(
        document.getElementById("name")
    );
}


function sayHello() {
    var name =
        document.getElementById("name").value;
    var message = "Hello " + name + "!"

    document
        .getElementById("content")
        .textContent = message;
}



function sayHello() {
    var name =
        document.getElementById("name").value;
    var message = "<h2>Hello " + name + "!<h2>"

    document
        .getElementById("content")
        .innerHTML = message;
}

*/

function sayHello() {
    var name =
        document.getElementById("name").value;
    var message = "<h2>Hello " + name + "!<h2>"

    document
        .getElementById("content")
        .innerHTML = message;

    if (name === "student") {
        var title =
            //document.getElementById("title")
            document
            //.querySelector("#title")
            .querySelector("h1")
            .textContent;
        title += " & Lovin' it!";
        document
            .querySelector("#title")
            .textContent = title;
    }
}