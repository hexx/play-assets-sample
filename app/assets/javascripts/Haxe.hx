class Haxe {
  static function main() {
    new js.JQuery(js.Lib.document).ready(function(evt) {
      new js.JQuery("#haxe").click(function(evt) {
        js.Lib.alert("Hello Haxe!");
      });
    });
  }
}
