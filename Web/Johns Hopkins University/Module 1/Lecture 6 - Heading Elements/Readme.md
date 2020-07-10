### Heading Elements and some new HTML5 semantics

 > Semantic to html means elements that implies some  meaning do the content
 > - *Human and/or machine can understand the meaning of content  surrounded by a semantic element*
 > - *May help search engine ranking (Search End Optimization - SEO)*
 > 
  
```html
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Heading Elements</title>
    </head>
    <body>
        <h1> This is the Main Heading </h1>
        <h2>Subheading 2</h2>
        <h3>Subheading 3</h3>
        <h4>Subheading 4</h4>
        <h5>Subheading 5</h5>
        <h6>Subheading 6</h6>
    </body>
    </html>
```

> - Headings are enumerate by the most important to the least important subject
> - As above the main subheader are always bigger then the beyond subheaders
> - They have visual distinction to each other
> - But only usable to structure purposes
> - CSS overrides its style
> 
## 
## 
#### Tags, uses and description:
> Header 
> Some header information goes here. Usually consist 
> of company logo, some tag line etc. 
> Sometimes navigation is contained in the header aswell 

> Nav (shor for navigation) element
>Usually contains links to diferent parts of website

> H1
> Main heading of the page (hard not to have it)
> Well chosen content of H1 element is crucial to SEO

> Section
> Contains articles

> Article
> Can also have sections

>  Div
> Division

> Aside 
> Some information that relates to the main content, i.e., related posts

> Footer
> Information about copyrights and author

```html

    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Document</title>
    </head>
    <body>
        <header>
            <nav> </nav>
        </header>
        <h1> </h1>
        <section>
            Section 1
            <article>Article 1</article>
            <article>Article 2</article>
            <article>Article 3</article>
        </section>
        <section>
            Section 2
            <article>Article 4</article>
            <article>Article 5</article>
            <article>Article 6</article>
            <div>Regular Div element</div>
        </section>
        <aside>
        </aside>
        <footer>
        </footer>
    </body>
    </html>

```

 

