## Introuction to AJAX

[Link to Lesson](https://www.coursera.org/learn/html-css-javascript-for-web-developers/lecture/21pyt/lesson-56-http-basics)

### HTTP Basics
 **H**yper**T**ext **T**ransfer **P**rotocol



> Essentially a client-server communication technique
>
> Based on request/ressponse stateless protocol
>
> Stateless in this context means that when the server responds
to a request from a browser, that response does not depend on any previous requests that the browser made
>
> the HTTP protocol is stateless. There's nothing inherently in it that remembers that you are the same person who requested or made that request between the browser and the server a couple of minutes ago
>
> * Client opens connection to the server
> * Client sends HTTP request for a resource
> * Server sends HTTP response to the cliente with resource
> * Client closes the connection to server
> <br>

<img src="image.jpeg" width="30%" height="auto" />

###### URN:
**U**niform **R**esorce **N**ame

> * Uniquely indentifies resource or name of resource
> * Does not tell us how to get the resource
>
> *"HTML/CSS/Javascript/Web Developers/Yaakov/Chaikin"*

###### URI:
**U**niform **R**esorce **I**dentifier

> * Uniquely indentifies resource or location of resource 
> * Does not necessarily tell us how to get the resource
>
> */official_web_site/index.html*


###### URL
**U**niform **R**esource **L**ocator

> * Form of URI that provides info on hot to get resource
>
> *http://www.mysite.com/official_site/index.html

###### HTTP Request Structure

<img src="Screenshot1.png" width="70%" height="auto" />

###### Get
> * Retrieves the resources
> * Data is passed to server as part of the URI
>
>   *I.e., query string*

###### Post
> * Sends data to server in order to be processed
> * Data is sent in the message body

<img src="Screenshot2.png" width="70%" height="auto" />

<img src="Screenshot.png" width="70%" height="auto" />

<img src="Screenshot0.png" width="70%" height="auto" />

###### Some Response Status Code

> **200 OK**
> * Ok, here is the content you requested
>
> **404 Not Found**
> * Server cant't find the resource requested
>
> **403 Forbidden**
> * Unauthenticated client tried to access a secure resource
>
> **500 Internal Server Error**
> * Some unhandled error was raised on the server

