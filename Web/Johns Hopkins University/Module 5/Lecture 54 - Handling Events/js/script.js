// Event Handling

/*

function sayHello(event) {
    this.textContent = "Said it!";
    //console.log(this); // this to the window object
    var name =
        document.getElementById("name").value;
    var message = "<h2>Hello " + name + "!</h2>"

    document
        .getElementById("content")
        .innerHTML = message;

    if (name === "student") {
        var title =
            //document.getElementById("title")
            document
            .querySelector("#title")
            //.querySelector("h1")
            .textContent;
        title += " & Lovin' it!";
        document
            .querySelector("h1")
            .textContent = title;
    }
}

// Unobstrusive Event Binging

document.querySelector("button")
    .addEventListener("click", sayHello);
/*
document.querySelector("button")
    .onclick = sayHello();
*/



// Event handling
document.addEventListener("DOMContentLoaded",
    function(event) {

        function sayHello(event) {
            this.textContent = "Said it!";
            var name =
                document.getElementById("name").value;
            var message = "<h2>Hello " + name + "!</h2>";

            document
                .getElementById("content")
                .innerHTML = message;

            if (name === "student") {
                var title =
                    document
                    .querySelector("#title")
                    .textContent;
                title += " & Lovin' it!";
                document
                    .querySelector("h1")
                    .textContent = title;
            }
        }

        // Unobtrusive event binding
        document.querySelector("button")
            .addEventListener("click", sayHello);

    }
);



// document.querySelector("button")
//   .onclick = sayHello;