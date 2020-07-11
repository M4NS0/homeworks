## Useful Linux Stuff

 <table class="table" <style>
  html {
            font-size: 1.3em;
            color: #373D49;
        }
        
        body {
            font-size: 1rem;
            font-weight: 400;
            line-height: 2rem;
        }
        
        .table {
            margin: 0 auto;
            border-collapse: collapse;
        }
        
        .table thead th {
            color: whitesmoke;
            text-align: center;
            background-color: #727272;
            border-width: 1px;
            border-color: #373D49;
        }
        
        .table thead tr,
        .table tbody,
        .table tbody td {
            padding-left: 20px;
            padding-right: 20px;
            border-style: solid;
            border-width: 1px;
            border-color: #444444;
            background-color: whitesmoke;
        }
</style>>
        <thead>
            <tr>
                <th>Subject</th>
                <th>Shortcut</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>Screen Brightness</td>
                <td>
                    <a href="https://github.com/M4NS0/Workspaces/tree/master/Linux#screen-brightness"><img src="https://github.com/M4NS0/Workspaces/blob/master/Web/Johns%20Hopkins%20University/github.png" style="width:8px; height:12px" title="Screen Brightness" alt="Screen Brightness"></a>
                </td>
            </tr>
            <tr>
                <td>One Line Update/Upgrade</td>
                <td>
                    <a href="https://github.com/M4NS0/Workspaces/tree/master/Linux#one-line-updateupgrade"><img src="https://github.com/M4NS0/Workspaces/blob/master/Web/Johns%20Hopkins%20University/github.png" style="width:8px; height:12px" title="One Line Update/Upgrade" alt="One Line Update and Upgrade"></a>
                </td>
            </tr>
        </tbody>
    </table>


<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>

###### Screen Brightness
1. To recognize the connected screens, run:
```sh
	$ xrandr -q
	# Or
	$ xrandr --listactivemonitors
```
2. Use the command with syntax: 
```sh
	$ xrandr --output Target-Screen --brightness Numeral-Value (x.x)
	$ xrandr --output Target-Screen --gamma Numeral-Group(x.xx:x.xx:x.xx)
```
> Exemple:
```sh
	$ xrandr --output HDMI-0 --brightness 1
	$ xrandr --output DVI-1 --brightness 1
	$ xrandr --output HDMI-0 --gamma 0.8:0.8:0.75

```

###### One Line Update/Upgrade

```sh
$ sudo apt update -y && sudo apt full-upgrade -y && sudo apt autoremove -y && sudo apt clean -y && sudo apt autoclean -y
```


