App.Views.pictureView = Backbone.View.extend({
   render : function(contents) {
       var content = Mustache.to_html($("#pictureTemplate").html(),{});
       $(this.el).html(content);
       var paper = Raphael("pictureContainer", 500, 500);
       paper.rect(1,1,490,490,10);
       paper.add(contents);       
   },
   
   events: {
       "click #insertButton" : "insertAction"
   },
   
   insertAction: function() {
       var node = new App.Models.Node({value : $("#value").val()})
       var self = this;
       node.save({}, {
            success: function(model, response) {
                //alert(JSON.stringify(response));
                self.render(response);
            }
        });
   }
});
