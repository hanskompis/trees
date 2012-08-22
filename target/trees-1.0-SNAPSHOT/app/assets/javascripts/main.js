App.Routers.Main = Backbone.Router.extend({
  routes: {
    "":    "home"
  },
  
  home : function() {
    var pictureView = new App.Views.pictureView ({el: $("#pictureContainer")});
    pictureView.render();
  }
});

