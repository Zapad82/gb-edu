// Получим пртотип для объекта Djaiv
const DjaivProto = Object.getPrototypeOf(Djaiv);
console.log(DjaivProto.model); // dancing series

const DjaivProtoProto = Object.getPrototypeOf(DjaivProto);
console.log(DjaivProtoProto.model); // vacuum cleaner

const DjaivProtoProtoProto = Object.getPrototypeOf(DjaivProtoProo);
console.log(DjaivProtoProtoProto.model); // [object Object]