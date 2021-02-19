
<img src="logo.png" width="100%" height="auto" />

## HTML, CSS and JavaScript for Web Developers

 Course Repository: [https://github.com/jhu-ep-coursera/fullstack-course4](https://github.com/jhu-ep-coursera/fullstack-course4)



| Module | Subject                                    | Link                                                                                                                                                                                                                                           |
| ------ | ------------------------------------------ | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 1      | HTML                                       | <a href="https://github.com/M4NS0/Workspaces/tree/master/Web/Johns%20Hopkins%20University/Module%201"><img src="github.png" style="width:12px; height:16px" title="Module 1 - HTML" alt="Module 1 - HTML"></a>                                 |
| 2      | CSS                                        | <a href="https://github.com/M4NS0/Workspaces/tree/master/Web/Johns%20Hopkins%20University/Module%202"><img src="github.png" style="width:12px; height:16px" title="Module 2 - CSS" alt="Module 2 - CSS"></a>                                   |
| 3      | Restaurant Site Development                | <a href="https://github.com/M4NS0/Workspaces/tree/master/Web/Johns%20Hopkins%20University/Module%203"><img src="github.png" style="width:12px; height:16px" title="Module 3 - Web Site Development" alt="Module 3 - Web Site Development"></a> |
| 4      | JavaScript Basics                          | <a href="http://tinyurl.com/yxfxlr3e"><img src="github.png" style="width:12px; height:16px" title="JavaScript Basics " alt="JavaScript Basics "></a>                                                                                           |
| 5      | Using Javascript to Build Web Applications | <a href="http://tinyurl.com/y6rfo2fn"><img src="github.png" style="width:12px; height:16px" title="Using Javascript to Build Web Applications" alt="Using Javascript to Build Web Applications"></a>                                           |




## Development Enviroment Setup
###### Requirements:
- Git
- GitHub Account
- Chrome CDT
- Sublime Text 3/VsCode
- Node JS
- Browser Sync 

###### Installations and Procedures

1. Install npm
```sh
    $ sudo apt install npm
```

2. Check npm Version
```sh
    $ npm --version
``` 

3. Install node JS Version
```sh
    $ sudo npm install nodejs
```

4. Check nodeJS Version
```sh
    $ npm nodejs --version
``` 

5. Check node Version
```sh
    $ npm node --version
```

6. Install Browser Sync
```sh
    $ npm install -g browser-sync
```

7. Check Browser Sync Version
```sh
    $ npm browser-sync --version
``` 

8. Removing node_modules from Git
```sh
    $ git rm -r --cached node_modules
    $ git commit -m 'Remove the now ignored directory node_modules'
    $ git push origin master
```

###### Alternative to Browser Sync: 
1. Create a test repository
2. Create an index.html
```html
    <!DOCTYPE html>
    <html lang="en">

        <head>
            <meta charset="UTF-8">
            <title>Document</title>
        </head>

        <body>
            Hello World
        </body>

    </html>
```
3. Into test folder, run:

```sh
    $ sudo npm install -g live-server
```

3. In same folder, run:

```sh
    $ live-server
```
<!--  -->
###### Alternative to live-server
1. Install VsCode extension "Live Server"

###### Usefull Tags Table

<img src="https://github.com/M4NS0/Workspaces/blob/master/Web/Johns%20Hopkins%20University/tags-table.jpg" width="100%" height="auto" />

######
