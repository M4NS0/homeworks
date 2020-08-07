### The Event Argument

[Link to Lesson](https://www.coursera.org/learn/html-css-javascript-for-web-developers/lecture/62R7T/lecture-55-the-event-argument)

See [Moozilla API - Events](https://developer.mozilla.org/pt-BR/docs/Web/API/Event)

        HTML Document:

```html
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <script src="js/script.js"></script>
    </head>
    <body>
        <h1 id="title">Lecture 55</h1>
        <p>
            Say hello to
            <input onblur="sayHello();" id="name" type="text">
            <button>
                Say it!
            </button>
        </p>
        <div id="content"></div>
    </body>
    </html>
```

        Script with mouse movement Event listener:

```js
    document.addEventListener("DOMContentLoaded",
        function(event) {

            function sayHello(event) {

                console.log(event);
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

            document.querySelector("body")
                .addEventListener("mousemove",
                    function(event) {
                        console.log("x:" + event.clientX);
                        console.log("y:" + event.clientY);
                    })

        }
    );
```

        Result:


<img src="Screenshot1.png" width="100%" height="auto" />

        Script with mouse movement Event listener only with shiftkey on:

```js
    ...
    document.querySelector("body")
        .addEventListener("mousemove",
            function(event) {
                if (event.shiftKey === true) { 
                    console.log("x:" + event.clientX);
                    console.log("y:" + event.clientY);
                }
            })
        }
    );


```