import "js.jsx";

native class jQuery {
  function click(: function(): void) : void;
}

class _Main {
  static function main() : void {
    var jq = js.global["$"] as function (: string) : jQuery;
    var alert = js.global["alert"] as function (: string) : void;
    jq("#jsx").click(function (): void {
      alert("Hello JSX!");
    });
  }
}
