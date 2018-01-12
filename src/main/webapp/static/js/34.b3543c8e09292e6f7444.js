webpackJsonp([34],{552:function(e,l,t){var a=t(20)(t(639),t(745),null,null,null);e.exports=a.exports},639:function(e,l,t){"use strict";Object.defineProperty(l,"__esModule",{value:!0}),l.default={data:function(){return{cityList:[{value:"beijing",label:"北京市"},{value:"shanghai",label:"上海市"},{value:"shenzhen",label:"深圳市"},{value:"hangzhou",label:"杭州市"},{value:"nanjing",label:"南京市"},{value:"chongqing",label:"重庆市"}],cityList1:[{value:"beijing",label:"北京市"},{value:"shanghai",label:"上海市"},{value:"shenzhen",label:"深圳市"}],cityList2:[{value:"hangzhou",label:"杭州市"},{value:"nanjing",label:"南京市"},{value:"chongqing",label:"重庆市"}],model1:"",model5:"",model6:"",model7:"",model8:"",model10:[],model11:"",model12:[]}}}},745:function(e,l){e.exports={render:function(){var e=this,l=e.$createElement,t=e._self._c||l;return t("div",[t("Row",[t("Col",{attrs:{span:"24"}},[t("div",{staticClass:"doc-header"},[t("Select",{staticStyle:{width:"200px"},model:{value:e.model1,callback:function(l){e.model1=l},expression:"model1"}},e._l(e.cityList,function(l){return t("Option",{key:l,attrs:{value:l.value}},[e._v(e._s(l.label))])}))],1),e._v(" "),t("div",{staticClass:"doc-content"},[t("h5",[e._v("基础用法")]),e._v(" "),t("p",[e._v("基本用法。可以使用 v-model 双向绑定数据。")]),e._v(" "),t("p",[e._v("单选时，value 只接受字符串和数字类型，多选时，只接受数组类型，组件会自动根据Option的value来返回选中的数据。")]),e._v(" "),t("p",[e._v("可以给Select添加 style 样式，比如宽度。")]),e._v(" "),t("p",[e._v("在展开选择器后，可以使用键盘的up和down快速上下选择，按下Enter选择，按下Esc收起选择器。")])])])],1),e._v(" "),t("Row",[t("Col",{attrs:{span:"24"}},[t("div",{staticClass:"doc-header"},[t("Select",{staticStyle:{width:"200px"},attrs:{clearable:""},model:{value:e.model8,callback:function(l){e.model8=l},expression:"model8"}},e._l(e.cityList,function(l){return t("Option",{key:l.value,attrs:{value:l.value}},[e._v(e._s(l.label))])}))],1),e._v(" "),t("div",{staticClass:"doc-content"},[t("h5",[e._v("可清空")]),e._v(" "),t("p",[e._v("通过设置属性clearable可以清空已选项，仅适用于单选模式。")])])])],1),e._v(" "),t("Row",[t("Col",{attrs:{span:"24"}},[t("div",{staticClass:"doc-header"},[t("Select",{staticStyle:{width:"200px"},model:{value:e.model7,callback:function(l){e.model7=l},expression:"model7"}},[t("Option-group",{attrs:{label:"热门城市"}},e._l(e.cityList1,function(l){return t("Option",{key:l.value,attrs:{value:l.value}},[e._v(e._s(l.label))])})),e._v(" "),t("Option-group",{attrs:{label:"其它城市"}},e._l(e.cityList2,function(l){return t("Option",{key:l.value,attrs:{value:l.value}},[e._v(e._s(l.label))])}))],1)],1),e._v(" "),t("div",{staticClass:"doc-content"},[t("h5",[e._v("分组")]),e._v(" "),t("p",[e._v("使用Option-group可将选项进行分")])])])],1),e._v(" "),t("Row",[t("Col",{attrs:{span:"24"}},[t("div",{staticClass:"doc-header"},[t("Select",{staticStyle:{width:"260px"},attrs:{multiple:""},model:{value:e.model10,callback:function(l){e.model10=l},expression:"model10"}},e._l(e.cityList,function(l){return t("Option",{key:l.value,attrs:{value:l.value}},[e._v(e._s(l.label))])}))],1),e._v(" "),t("div",{staticClass:"doc-content"},[t("h5",[e._v("多选")]),e._v(" "),t("p",[e._v("通过设置属性multiple可以开启多选模式。多选模式下，model 接受数组类型的数据，所返回的也是数组。")])])])],1),e._v(" "),t("Row",[t("Col",{attrs:{span:"24"}},[t("div",{staticClass:"doc-header"},[t("Select",{attrs:{filterable:""},model:{value:e.model11,callback:function(l){e.model11=l},expression:"model11"}},e._l(e.cityList,function(l){return t("Option",{key:l.value,attrs:{value:l.value}},[e._v(e._s(l.label))])})),e._v(" "),t("Select",{attrs:{filterable:"",multiple:""},model:{value:e.model12,callback:function(l){e.model12=l},expression:"model12"}},e._l(e.cityList,function(l){return t("Option",{key:l.value,attrs:{value:l.value}},[e._v(e._s(l.label))])}))],1),e._v(" "),t("div",{staticClass:"doc-content"},[t("h5",[e._v("可搜索")]),e._v(" "),t("p",[e._v("通过设置属性filterable可以开启搜索模式。单选和多选都支持搜索模式。多选搜索时，可以使用键盘Delete快捷删除最后一个已选项。")])])])],1)],1)},staticRenderFns:[]}}});
//# sourceMappingURL=34.b3543c8e09292e6f7444.js.map