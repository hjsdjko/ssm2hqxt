(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/xiangmumingcheng/add-or-update"],{"178c":function(e,n,t){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var r=a(t("a34a"));function a(e){return e&&e.__esModule?e:{default:e}}function u(e,n,t,r,a,u,i){try{var c=e[u](i),o=c.value}catch(s){return void t(s)}c.done?n(o):Promise.resolve(o).then(r,a)}function i(e){return function(){var n=this,t=arguments;return new Promise((function(r,a){var i=e.apply(n,t);function c(e){u(i,r,a,c,o,"next",e)}function o(e){u(i,r,a,c,o,"throw",e)}c(void 0)}))}}var c=function(){Promise.all([t.e("common/vendor"),t.e("components/w-picker/w-picker")]).then(function(){return resolve(t("dad4"))}.bind(null,t)).catch(t.oe)},o={data:function(){return{cross:"",ruleForm:{jianshenxiangmu:""},user:{},ro:{jianshenxiangmu:!1}}},components:{wPicker:c},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(n){var t=this;return i(r.default.mark((function a(){var u,i,c,o;return r.default.wrap((function(a){while(1)switch(a.prev=a.next){case 0:return u=e.getStorageSync("nowTable"),a.next=3,t.$api.session(u);case 3:if(i=a.sent,t.user=i.data,t.ruleForm.userid=e.getStorageSync("userid"),n.refid&&(t.ruleForm.refid=n.refid,t.ruleForm.nickname=e.getStorageSync("nickname")),!n.id){a.next=13;break}return t.ruleForm.id=n.id,a.next=11,t.$api.info("xiangmumingcheng",t.ruleForm.id);case 11:i=a.sent,t.ruleForm=i.data;case 13:if(t.cross=n.cross,!n.cross){a.next=25;break}c=e.getStorageSync("crossObj"),a.t0=r.default.keys(c);case 17:if((a.t1=a.t0()).done){a.next=25;break}if(o=a.t1.value,"jianshenxiangmu"!=o){a.next=23;break}return t.ruleForm.jianshenxiangmu=c[o],t.ro.jianshenxiangmu=!0,a.abrupt("continue",17);case 23:a.next=17;break;case 25:t.styleChange();case 26:case"end":return a.stop()}}),a)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var n=this;return i(r.default.mark((function t(){var a,u,i,c,o,s,f,l,d,g;return r.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(n.ruleForm.jianshenxiangmu){t.next=3;break}return n.$utils.msg("健身项目不能为空"),t.abrupt("return");case 3:if(!n.cross){t.next=19;break}if(c=e.getStorageSync("statusColumnName"),o=e.getStorageSync("statusColumnValue"),""==c){t.next=19;break}if(s=e.getStorageSync("crossObj"),c.startsWith("[")){t.next=15;break}for(f in s)f==c&&(s[f]=o);return l=e.getStorageSync("crossTable"),t.next=13,n.$api.update("".concat(l),s);case 13:t.next=19;break;case 15:a=Number(e.getStorageSync("userid")),u=s["id"],i=e.getStorageSync("statusColumnName"),i=i.replace(/\[/,"").replace(/\]/,"");case 19:if(!u||!a){t.next=41;break}return n.ruleForm.crossuserid=a,n.ruleForm.crossrefid=u,d={page:1,limit:10,crossuserid:a,crossrefid:u},t.next=25,n.$api.list("xiangmumingcheng",d);case 25:if(g=t.sent,!(g.data.total>=i)){t.next=31;break}return n.$utils.msg(e.getStorageSync("tips")),t.abrupt("return",!1);case 31:if(!n.ruleForm.id){t.next=36;break}return t.next=34,n.$api.update("xiangmumingcheng",n.ruleForm);case 34:t.next=38;break;case 36:return t.next=38,n.$api.add("xiangmumingcheng",n.ruleForm);case 38:n.$utils.msgBack("提交成功");case 39:t.next=49;break;case 41:if(!n.ruleForm.id){t.next=46;break}return t.next=44,n.$api.update("xiangmumingcheng",n.ruleForm);case 44:t.next=48;break;case 46:return t.next=48,n.$api.add("xiangmumingcheng",n.ruleForm);case 48:n.$utils.msgBack("提交成功");case 49:case"end":return t.stop()}}),t)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,t=n.getFullYear(),r=n.getMonth()+1,a=n.getDate();return"start"===e?t-=60:"end"===e&&(t+=2),r=r>9?r:"0"+r,a=a>9?a:"0"+a,"".concat(t,"-").concat(r,"-").concat(a)},toggleTab:function(e){this.$refs[e].show()}}};n.default=o}).call(this,t("543d")["default"])},"6c5b":function(e,n,t){"use strict";t.r(n);var r=t("178c"),a=t.n(r);for(var u in r)"default"!==u&&function(e){t.d(n,e,(function(){return r[e]}))}(u);n["default"]=a.a},7796:function(e,n,t){},"902b":function(e,n,t){"use strict";var r;t.d(n,"b",(function(){return a})),t.d(n,"c",(function(){return u})),t.d(n,"a",(function(){return r}));var a=function(){var e=this,n=e.$createElement;e._self._c},u=[]},c4e3:function(e,n,t){"use strict";t.r(n);var r=t("902b"),a=t("6c5b");for(var u in a)"default"!==u&&function(e){t.d(n,e,(function(){return a[e]}))}(u);t("f264");var i,c=t("f0c5"),o=Object(c["a"])(a["default"],r["b"],r["c"],!1,null,"603209b2",null,!1,r["a"],i);n["default"]=o.exports},f264:function(e,n,t){"use strict";var r=t("7796"),a=t.n(r);a.a},f369:function(e,n,t){"use strict";(function(e){t("1738");r(t("66fd"));var n=r(t("c4e3"));function r(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,t("543d")["createPage"])}},[["f369","common/runtime","common/vendor"]]]);