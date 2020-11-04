// component is a typescript class

import { Component } from '@angular/core';

@Component({
    // will be stored in metadata
    selector:  'app-server',    // the html tag, unique selector
    templateUrl: './server.component.html'
})
export class ServerComponent {
    serverId: number = 10;
    serverStatus: string  = 'offline'

    // this method will return a String to the String Interpolation 
    getServerStatus() {           
        return this.serverStatus; 
    }
}