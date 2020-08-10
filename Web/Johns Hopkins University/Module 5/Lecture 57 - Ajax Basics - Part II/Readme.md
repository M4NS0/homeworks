### Ajax Basics - Part II
[Link to Lesson](https://www.coursera.org/learn/html-css-javascript-for-web-developers/lecture/ewvvr/lesson-57-part-2-ajax-basics)


        HTML Document:

```html
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <script src="js/ajax-utils.js"></script>
        <script src="js/script.js"></script>
    </head>
    <body>
        <h1 id="title"> Lecture 57</h1>
    </body>
    <p>
        <button>
            Say Hello to my little friend on the server
        </button>
    </p>
    <div id="content"></div>
    </html>
```

        Ajax-Utils.js 

```js
    (function(global) {
        // Setup a namespace for our utility
        var ajaxUtils = {};

        
        function getRequestObject() {
            if (window.XMLHttpRequest) {
                return (new XMLHttpRequest());
            } else if (window.ActiveXObject) {
                // For very old IE browsers (optional)
                return (new ActiveXObject("Microsoft.XMLHTTP"));
            } else {
                global.alert("Ajax is not supported!");
                return (null);
            }
        }
```
> *function getRequestObject()* Returns an HTTP request object
```js
 
        ajaxUtils.sendGetRequest =
            function(requestUrl, responseHandler) {
                var request = getRequestObject();
                request.onreadystatechange =
                    //function() {
                        handleResponse; // (request, responseHandler);
                    };
                request.open("GET", requestUrl, true);
                request.send(null); // for POST only
            }
```
> *ajaxUtils.sendGetRequest* Makes an Ajax GET request to 'requestURL' (server)
> * Only calls user provided 'responseHandler'
> * Function in response is ready
> * And not an error, then:
```js
        function handleResponse(request, responseHandler) {
            if ((request.readyState == 4) &&
                (request.status = 200)) {
                responseHandler(request);
            }
        }
```
> Make Ajax-Utils avaliable globaly and start function trigger:
```js
        global.$ajaxUtils = ajaxUtils;

    })(window);
```
        End of Ajax-Utils script
