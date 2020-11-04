### The Complete Angular Course: Beginner to Advanced

> **Angular:**
>* A framework for building client applications 
>* HTML, CSS, JavaScript/TypeScript 
>* *It's hard to maintain the vanilla JavaScript or JQuery in bigger applications*
<br>
> ###### *Benefits of Angular framework:*
>* Gives our applications a clean structure 
>* Includes a lot of reusable code
>* Makes our applications more testable

<br>

##### Architecture of a Angular Apps

|                         |                     |                     |
| ----------------------- | ------------------- | ------------------- |
| **User Interface (UI)** |                     | **Data Processing** |
| Front-End               | <<<<<< <br>  >>>>>> | Back-End            |
| HTML                    |                     | API                 |
| CSS                     |                     | DataBases           |
| TypeScript              |                     |                     |
| Angular                 |                     |                     |

<br>

##### Configuring

1. Install [NodeJs](nodejs.org)
2. What version is? 
```sh
    #In Terminal: 
    node --version
```
3. Install Angular CLI (command-line interface)
```sh
    #In Terminal:
    npm install -g @angular/cli
```
4. What version is?
```sh
    #In Terminal:
    ng --version
```
5. Create a new Angular Project
```sh
    #In Terminal:
    ng new hello-world
```
6. In VSCode type Shift + control + P to open command pallete
7. Install code command Shell in path
8. To open your project in Vscode, type:
```sh
    #In Terminal
    code .
```
9. Test your Angular Application
```sh 
    #In Terminal
    ng serve
```
10. Open .gitignore and copy it's contents.
11. Delete the .gitignore
12. Create a new .gitignore document:
```sh
    #In Terminal:
    touch .gitignore
```
13. Open the new .gitignore file and paste the old .gitignore contents inside of it, or use gedit and paste inside of it:
```sh
    #In Terminal:
    gedit .gitignore
```
14. Add your project to Git/Github:
```sh
    #In Terminal:
    git add .
    git commit -m "gitignoring Angular things"
    git push
```
<br>

#### Folders structure

|                    |                                                                                                                                              |
| ------------------ | -------------------------------------------------------------------------------------------------------------------------------------------- |
| e2e                | End-to-End - automatically tests for application  that simulates a real user                                                                 |
| node_modules       | Third party's libraries that application depends apart. They are put in a bundle that will be depploy into the application's server          |
| src                | The source code of the application                                                                                                           |
| src/app/           | app.components and app.modules every application have at least one module and one component                                                  |
| src/assets/        | The static assets of the application: icons, sounds etc                                                                                      |
| src/enviroments/   | Configuration settings for different enviroments one for production and one for enviroment                                                   |
| src/favicon.ico    | Icon displayed in the tab of browser, bookmarks etc.                                                                                         |
| src/index.html     | It's a simple html documment that will be dinamically changed with Angular                                                                   |
| src/main.ts        | The starting point of the application, the main method. It will load some modules including bootstrap codes                                  |
| src/polyfills      | Imports for some scripts of Angular, using JavaScripts features and current browsers also, filling all gaps                                  |
| src/styles.css     | To add the global styles of the application                                                                                                  |
| src/test.ts        | Used to setting up the testing enviroment                                                                                                    |
| .angular-cli.json  | Angular's Standard configurations                                                                                                            |
| .editorconfig      | To make sure that all developers in a team are working under the same configurations, storing the settings                                   |
| .gitignore         | Excludes certain files and folders out off Git repositories                                                                                  |
| karma.conf.js      | Configuration file, a test runner for JavaScript code                                                                                        |
| package.json       | Standard file, setting like the name of the project, it's version, licences, whole dependency (libraries) versions that the application uses |
| protractor.conf.js | Tool for running ent to end test                                                                                                             |
| tsconfig.json      | Settings for TypeScript compiler to JavaScript                                                                                               |
| tslint.json        | Setting for tslint, a static analises tool for TypeScript code readability, maintainability and functionality errors                         |


### Bookmark: 7. Webpack