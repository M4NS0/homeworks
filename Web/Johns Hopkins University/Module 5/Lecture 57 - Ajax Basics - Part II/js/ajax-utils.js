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
    /*
    var request = getRequestObject();
    var myhandler = null;
    ajaxUtils.sendGetRequest =
        function(requestUrl, responseHandler) {
            myhandler = responseHandler;
            request.onreadystatechange =
                handleResponse;

            request.open("GET", requestUrl, true);
            request.send(null); // for POST only
        };

    */
    ajaxUtils.sendGetRequest =
        function(requestUrl, responseHandler) {
            var request = getRequestObject();
            request.onreadystatechange =
                function() {
                    handleResponse(request, responseHandler);
                };
            request.open("GET", requestUrl, true);
            request.send(null); // for POST only
        }

    function handleResponse(request, responseHandler) {
        if ((request.readyState == 4) &&
            (request.status = 200)) {
            responseHandler(request);
        }
    }

    global.$ajaxUtils = ajaxUtils;

})(window);