/*
// Event handler
document.addEventListener("DOMContentLoaded",
    function(event) {
        // Unobstrusive event biding
        document.querySelector("button")
            .addEventListener("click", function() {
                var self = this;
                var name = "";

                // Call server to get the name
                $ajaxUtils.sendGetRequest("/data/name.txt",
                    function(request) {
                        self.name = request.responseText;
                        console.log(self.name);
                    });
                document.querySelector("#content")
                    .innerHTML = "<h2>Hello " + self.name + "!";
            });
    }
);
*/
// Event handler
document.addEventListener("DOMContentLoaded",
    function(event) {

        // Unobtrusive event binding
        document.querySelector("button")
            .addEventListener("click", function() {

                // Call server to get the name
                $ajaxUtils
                    .sendGetRequest("data/name.txt",
                        function(request) {
                            var name = request.responseText;

                            document.querySelector("#content")
                                .innerHTML = "<h2>Hello " + name + "!</h2>";
                        });
            });
    }
);