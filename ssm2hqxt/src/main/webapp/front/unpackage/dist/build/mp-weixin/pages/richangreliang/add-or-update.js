(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/richangreliang/add-or-update"],{"003d":function(e,n,r){"use strict";r.d(n,"b",(function(){return a})),r.d(n,"c",(function(){return i})),r.d(n,"a",(function(){return t}));var t={wPicker:function(){return Promise.all([r.e("common/vendor"),r.e("components/w-picker/w-picker")]).then(r.bind(null,"dad4"))}},a=function(){var e=this,n=e.$createElement;e._self._c},i=[]},"2e0a":function(e,n,r){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var t=a(r("a34a"));function a(e){return e&&e.__esModule?e:{default:e}}function i(e,n,r,t,a,i,u){try{var o=e[i](u),c=o.value}catch(s){return void r(s)}o.done?n(c):Promise.resolve(c).then(t,a)}function u(e){return function(){var n=this,r=arguments;return new Promise((function(t,a){var u=e.apply(n,r);function o(e){i(u,t,a,o,c,"next",e)}function c(e){i(u,t,a,o,c,"throw",e)}o(void 0)}))}}var o=function(){Promise.all([r.e("common/vendor"),r.e("components/w-picker/w-picker")]).then(function(){return resolve(r("dad4"))}.bind(null,r)).catch(r.oe)},c={data:function(){return{cross:"",ruleForm:{biaoti:"",yonghuming:"",zaocandapei:"",wucandapei:"",wancandapei:"",dengjishijian:""},user:{},ro:{biaoti:!1,yonghuming:!1,zaocandapei:!1,wucandapei:!1,wancandapei:!1,dengjishijian:!1}}},components:{wPicker:o},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(n){var r=this;return u(t.default.mark((function a(){var i,u,o,c;return t.default.wrap((function(a){while(1)switch(a.prev=a.next){case 0:return r.ruleForm.dengjishijian=r.$utils.getCurDateTime(),i=e.getStorageSync("nowTable"),a.next=4,r.$api.session(i);case 4:if(u=a.sent,r.user=u.data,r.ruleForm.yonghuming=r.user.yonghuming,r.ro.yonghuming=!0,r.ruleForm.userid=e.getStorageSync("userid"),n.refid&&(r.ruleForm.refid=n.refid,r.ruleForm.nickname=e.getStorageSync("nickname")),!n.id){a.next=16;break}return r.ruleForm.id=n.id,a.next=14,r.$api.info("richangreliang",r.ruleForm.id);case 14:u=a.sent,r.ruleForm=u.data;case 16:if(r.cross=n.cross,!n.cross){a.next=48;break}o=e.getStorageSync("crossObj"),a.t0=t.default.keys(o);case 20:if((a.t1=a.t0()).done){a.next=48;break}if(c=a.t1.value,"biaoti"!=c){a.next=26;break}return r.ruleForm.biaoti=o[c],r.ro.biaoti=!0,a.abrupt("continue",20);case 26:if("yonghuming"!=c){a.next=30;break}return r.ruleForm.yonghuming=o[c],r.ro.yonghuming=!0,a.abrupt("continue",20);case 30:if("zaocandapei"!=c){a.next=34;break}return r.ruleForm.zaocandapei=o[c],r.ro.zaocandapei=!0,a.abrupt("continue",20);case 34:if("wucandapei"!=c){a.next=38;break}return r.ruleForm.wucandapei=o[c],r.ro.wucandapei=!0,a.abrupt("continue",20);case 38:if("wancandapei"!=c){a.next=42;break}return r.ruleForm.wancandapei=o[c],r.ro.wancandapei=!0,a.abrupt("continue",20);case 42:if("dengjishijian"!=c){a.next=46;break}return r.ruleForm.dengjishijian=o[c],r.ro.dengjishijian=!0,a.abrupt("continue",20);case 46:a.next=20;break;case 48:r.styleChange();case 49:case"end":return a.stop()}}),a)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},dengjishijianConfirm:function(e){console.log(e),this.ruleForm.dengjishijian=e.result,this.$forceUpdate()},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var n=this;return u(t.default.mark((function r(){var a,i,u,o,c,s,d,l,f,g;return t.default.wrap((function(r){while(1)switch(r.prev=r.next){case 0:if(!n.cross){r.next=16;break}if(o=e.getStorageSync("statusColumnName"),c=e.getStorageSync("statusColumnValue"),""==o){r.next=16;break}if(s=e.getStorageSync("crossObj"),o.startsWith("[")){r.next=12;break}for(d in s)d==o&&(s[d]=c);return l=e.getStorageSync("crossTable"),r.next=10,n.$api.update("".concat(l),s);case 10:r.next=16;break;case 12:a=Number(e.getStorageSync("userid")),i=s["id"],u=e.getStorageSync("statusColumnName"),u=u.replace(/\[/,"").replace(/\]/,"");case 16:if(!i||!a){r.next=38;break}return n.ruleForm.crossuserid=a,n.ruleForm.crossrefid=i,f={page:1,limit:10,crossuserid:a,crossrefid:i},r.next=22,n.$api.list("richangreliang",f);case 22:if(g=r.sent,!(g.data.total>=u)){r.next=28;break}return n.$utils.msg(e.getStorageSync("tips")),r.abrupt("return",!1);case 28:if(!n.ruleForm.id){r.next=33;break}return r.next=31,n.$api.update("richangreliang",n.ruleForm);case 31:r.next=35;break;case 33:return r.next=35,n.$api.add("richangreliang",n.ruleForm);case 35:n.$utils.msgBack("提交成功");case 36:r.next=46;break;case 38:if(!n.ruleForm.id){r.next=43;break}return r.next=41,n.$api.update("richangreliang",n.ruleForm);case 41:r.next=45;break;case 43:return r.next=45,n.$api.add("richangreliang",n.ruleForm);case 45:n.$utils.msgBack("提交成功");case 46:case"end":return r.stop()}}),r)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,r=n.getFullYear(),t=n.getMonth()+1,a=n.getDate();return"start"===e?r-=60:"end"===e&&(r+=2),t=t>9?t:"0"+t,a=a>9?a:"0"+a,"".concat(r,"-").concat(t,"-").concat(a)},toggleTab:function(e){this.$refs[e].show()}}};n.default=c}).call(this,r("543d")["default"])},"8b15":function(e,n,r){"use strict";r.r(n);var t=r("003d"),a=r("fc0d");for(var i in a)"default"!==i&&function(e){r.d(n,e,(function(){return a[e]}))}(i);r("e521");var u,o=r("f0c5"),c=Object(o["a"])(a["default"],t["b"],t["c"],!1,null,"83fc9cbe",null,!1,t["a"],u);n["default"]=c.exports},c3e1:function(e,n,r){},d206:function(e,n,r){"use strict";(function(e){r("1738");t(r("66fd"));var n=t(r("8b15"));function t(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,r("543d")["createPage"])},e521:function(e,n,r){"use strict";var t=r("c3e1"),a=r.n(t);a.a},fc0d:function(e,n,r){"use strict";r.r(n);var t=r("2e0a"),a=r.n(t);for(var i in t)"default"!==i&&function(e){r.d(n,e,(function(){return t[e]}))}(i);n["default"]=a.a}},[["d206","common/runtime","common/vendor"]]]);