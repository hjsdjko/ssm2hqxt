<template>
	<view class="container">
		<form>
			<view class="cu-form-group">
				<textarea :style='{"padding":"20rpx","boxShadow":"0 8rpx 0px 4rpx #A86B58","margin":"20rpx 0","borderColor":"rgba(0,0,0,.6)","backgroundColor":"rgba(194, 114, 89, 1)","color":"rgba(255, 255, 255, 1)","borderRadius":"20rpx 20rpx 0 0","borderWidth":"0","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"300rpx"}' v-model="content" placeholder="回复"></textarea>
			</view>
			<button :style='{"padding":"0 20rpx","boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","margin":"20rpx 0","borderColor":"#409EFF","backgroundColor":"#409EFF","color":"#fff","borderRadius":"8rpx","borderWidth":"1","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onReplyTap" class="bg-red margin-tb-sm">提交回复</button>
		</form>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				pid: '',
				content: '',
				username: '',
				user: {},
			}
		},
		async onLoad(options) {
			this.pid = options.pid;
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
						            						                                    if(table == `yonghu`){
                this.username = this.user.yonghuming
            }
                                                                                                                                                						            						                                    if(table == `jianshenfang`){
                this.username = this.user.jianshenfangmingcheng
            }
                                                                                                                                                                        						            			            			            			            			            			            			            			            			            			            			            			            		},
		methods: {
			async onReplyTap() {
				await this.$api.save('forum',{
					parentid: this.pid,
					content: this.content,
					username: this.username
				});
				this.$utils.msgBack('回复成功');
			}
		}
	}
</script>

<style>
	page {
		background-color: #fff;
	}
	
	.container {
		padding: 20upx;
	}
	
	.cu-form-group {
		padding: 0;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.bg-red {
		line-height: 80rpx;
	}
</style>
