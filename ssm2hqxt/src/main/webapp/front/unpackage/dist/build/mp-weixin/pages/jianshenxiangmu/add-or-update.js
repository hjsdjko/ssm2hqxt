(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/jianshenxiangmu/add-or-update"],{"007a":function(n,e,a){"use strict";a.r(e);var i=a("b997"),r=a.n(i);for(var t in i)"default"!==t&&function(n){a.d(e,n,(function(){return i[n]}))}(t);e["default"]=r.a},"64ec":function(n,e,a){"use strict";var i=a("9142"),r=a.n(i);r.a},9142:function(n,e,a){},b997:function(n,e,a){"use strict";(function(n){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0;var i=r(a("a34a"));function r(n){return n&&n.__esModule?n:{default:n}}function t(n,e,a,i,r,t,u){try{var s=n[t](u),o=s.value}catch(c){return void a(c)}s.done?e(o):Promise.resolve(o).then(i,r)}function u(n){return function(){var e=this,a=arguments;return new Promise((function(i,r){var u=n.apply(e,a);function s(n){t(u,i,r,s,o,"next",n)}function o(n){t(u,i,r,s,o,"throw",n)}s(void 0)}))}}var s=function(){Promise.all([a.e("common/vendor"),a.e("components/w-picker/w-picker")]).then(function(){return resolve(a("dad4"))}.bind(null,a)).catch(a.oe)},o={data:function(){return{cross:"",ruleForm:{xiangmubianhao:this.getUUID(),jianshenxiangmu:"",xiangmufengmian:"",jianshenleixing:"",shiherenqun:"",xiangmujiage:"",keshishu:"",jianshenfangmingcheng:"",jianshenfangdizhi:"",xiangqing:""},jianshenxiangmuOptions:[],jianshenxiangmuIndex:0,user:{},ro:{xiangmubianhao:!1,jianshenxiangmu:!1,xiangmufengmian:!1,jianshenleixing:!1,shiherenqun:!1,xiangmujiage:!1,keshishu:!1,jianshenfangmingcheng:!1,jianshenfangdizhi:!1,xiangqing:!1}}},components:{wPicker:s},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(e){var a=this;return u(i.default.mark((function r(){var t,u,s,o;return i.default.wrap((function(r){while(1)switch(r.prev=r.next){case 0:return t=n.getStorageSync("nowTable"),r.next=3,a.$api.session(t);case 3:return u=r.sent,a.user=u.data,a.ruleForm.jianshenfangmingcheng=a.user.jianshenfangmingcheng,a.ro.jianshenfangmingcheng=!0,a.ruleForm.jianshenfangdizhi=a.user.jianshenfangdizhi,a.ro.jianshenfangdizhi=!0,r.next=11,a.$api.option("xiangmumingcheng","jianshenxiangmu",{});case 11:if(u=r.sent,a.jianshenxiangmuOptions=u.data,a.ruleForm.userid=n.getStorageSync("userid"),e.refid&&(a.ruleForm.refid=e.refid,a.ruleForm.nickname=n.getStorageSync("nickname")),!e.id){r.next=21;break}return a.ruleForm.id=e.id,r.next=19,a.$api.info("jianshenxiangmu",a.ruleForm.id);case 19:u=r.sent,a.ruleForm=u.data;case 21:if(a.cross=e.cross,!e.cross){r.next=69;break}s=n.getStorageSync("crossObj"),r.t0=i.default.keys(s);case 25:if((r.t1=r.t0()).done){r.next=69;break}if(o=r.t1.value,"xiangmubianhao"!=o){r.next=31;break}return a.ruleForm.xiangmubianhao=s[o],a.ro.xiangmubianhao=!0,r.abrupt("continue",25);case 31:if("jianshenxiangmu"!=o){r.next=35;break}return a.ruleForm.jianshenxiangmu=s[o],a.ro.jianshenxiangmu=!0,r.abrupt("continue",25);case 35:if("xiangmufengmian"!=o){r.next=39;break}return a.ruleForm.xiangmufengmian=s[o],a.ro.xiangmufengmian=!0,r.abrupt("continue",25);case 39:if("jianshenleixing"!=o){r.next=43;break}return a.ruleForm.jianshenleixing=s[o],a.ro.jianshenleixing=!0,r.abrupt("continue",25);case 43:if("shiherenqun"!=o){r.next=47;break}return a.ruleForm.shiherenqun=s[o],a.ro.shiherenqun=!0,r.abrupt("continue",25);case 47:if("xiangmujiage"!=o){r.next=51;break}return a.ruleForm.xiangmujiage=s[o],a.ro.xiangmujiage=!0,r.abrupt("continue",25);case 51:if("keshishu"!=o){r.next=55;break}return a.ruleForm.keshishu=s[o],a.ro.keshishu=!0,r.abrupt("continue",25);case 55:if("jianshenfangmingcheng"!=o){r.next=59;break}return a.ruleForm.jianshenfangmingcheng=s[o],a.ro.jianshenfangmingcheng=!0,r.abrupt("continue",25);case 59:if("jianshenfangdizhi"!=o){r.next=63;break}return a.ruleForm.jianshenfangdizhi=s[o],a.ro.jianshenfangdizhi=!0,r.abrupt("continue",25);case 63:if("xiangqing"!=o){r.next=67;break}return a.ruleForm.xiangqing=s[o],a.ro.xiangqing=!0,r.abrupt("continue",25);case 67:r.next=25;break;case 69:a.styleChange();case 70:case"end":return r.stop()}}),r)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},jianshenxiangmuChange:function(n){this.jianshenxiangmuIndex=n.target.value,this.ruleForm.jianshenxiangmu=this.jianshenxiangmuOptions[this.jianshenxiangmuIndex]},xiangmufengmianTap:function(){var n=this;this.$api.upload((function(e){n.ruleForm.xiangmufengmian="upload/"+e.file,n.$forceUpdate(),n.$nextTick((function(){n.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=this;return u(i.default.mark((function a(){var r,t,u,s,o,c,g,f,m,h;return i.default.wrap((function(a){while(1)switch(a.prev=a.next){case 0:if(e.ruleForm.jianshenxiangmu){a.next=3;break}return e.$utils.msg("健身项目不能为空"),a.abrupt("return");case 3:if(e.ruleForm.xiangmufengmian){a.next=6;break}return e.$utils.msg("项目封面不能为空"),a.abrupt("return");case 6:if(e.ruleForm.xiangmujiage){a.next=9;break}return e.$utils.msg("项目价格不能为空"),a.abrupt("return");case 9:if(!e.cross){a.next=25;break}if(s=n.getStorageSync("statusColumnName"),o=n.getStorageSync("statusColumnValue"),""==s){a.next=25;break}if(c=n.getStorageSync("crossObj"),s.startsWith("[")){a.next=21;break}for(g in c)g==s&&(c[g]=o);return f=n.getStorageSync("crossTable"),a.next=19,e.$api.update("".concat(f),c);case 19:a.next=25;break;case 21:r=Number(n.getStorageSync("userid")),t=c["id"],u=n.getStorageSync("statusColumnName"),u=u.replace(/\[/,"").replace(/\]/,"");case 25:if(!t||!r){a.next=47;break}return e.ruleForm.crossuserid=r,e.ruleForm.crossrefid=t,m={page:1,limit:10,crossuserid:r,crossrefid:t},a.next=31,e.$api.list("jianshenxiangmu",m);case 31:if(h=a.sent,!(h.data.total>=u)){a.next=37;break}return e.$utils.msg(n.getStorageSync("tips")),a.abrupt("return",!1);case 37:if(!e.ruleForm.id){a.next=42;break}return a.next=40,e.$api.update("jianshenxiangmu",e.ruleForm);case 40:a.next=44;break;case 42:return a.next=44,e.$api.add("jianshenxiangmu",e.ruleForm);case 44:e.$utils.msgBack("提交成功");case 45:a.next=55;break;case 47:if(!e.ruleForm.id){a.next=52;break}return a.next=50,e.$api.update("jianshenxiangmu",e.ruleForm);case 50:a.next=54;break;case 52:return a.next=54,e.$api.add("jianshenxiangmu",e.ruleForm);case 54:e.$utils.msgBack("提交成功");case 55:case"end":return a.stop()}}),a)})))()},optionsChange:function(n){this.index=n.target.value},bindDateChange:function(n){this.date=n.target.value},getDate:function(n){var e=new Date,a=e.getFullYear(),i=e.getMonth()+1,r=e.getDate();return"start"===n?a-=60:"end"===n&&(a+=2),i=i>9?i:"0"+i,r=r>9?r:"0"+r,"".concat(a,"-").concat(i,"-").concat(r)},toggleTab:function(n){this.$refs[n].show()}}};e.default=o}).call(this,a("543d")["default"])},bc8a:function(n,e,a){"use strict";var i;a.d(e,"b",(function(){return r})),a.d(e,"c",(function(){return t})),a.d(e,"a",(function(){return i}));var r=function(){var n=this,e=n.$createElement;n._self._c},t=[]},ca1e:function(n,e,a){"use strict";(function(n){a("1738");i(a("66fd"));var e=i(a("e782"));function i(n){return n&&n.__esModule?n:{default:n}}n(e.default)}).call(this,a("543d")["createPage"])},e782:function(n,e,a){"use strict";a.r(e);var i=a("bc8a"),r=a("007a");for(var t in r)"default"!==t&&function(n){a.d(e,n,(function(){return r[n]}))}(t);a("64ec");var u,s=a("f0c5"),o=Object(s["a"])(r["default"],i["b"],i["c"],!1,null,"9ed8b0b2",null,!1,i["a"],u);e["default"]=o.exports}},[["ca1e","common/runtime","common/vendor"]]]);