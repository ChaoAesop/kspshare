<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>发帖</title>

	<!-- Google Fonts -->
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i&amp;subset=latin-ext">
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto+Slab:300,400,700&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese">
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,500,500i,700,700i,900,900i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese">
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato:300,300i,400,400i,700,700i,900&amp;subset=latin-ext">

	<link rel="stylesheet" href="../../static/plugin/pagination/jquery.pagination.css" />
	<link rel="stylesheet" href="../plugin/jqueryUi/jquery-ui.min.css" />
	<link rel="stylesheet" href="../../static/css/font-awesome.min.css">
	<link rel="stylesheet" href="../../static/plugin/flexslider/flexslider.css">
	<link rel="stylesheet" href="../plugin/slicknav/slicknav.min.css">
	<link rel="stylesheet" href="../plugin/editor/wangEditor.css" />
	<link rel="stylesheet" href="../plugin/tagInput/jquery.tagsinput-revisited.min.css" />
	<link rel="stylesheet" href="../plugin/switch/titatoggle-dist.css">

	<!--自定义样式-->
	<link rel="stylesheet" href="../../static/css/main.css" >
	<link rel="stylesheet" href="../../static/css/forum.css">

</head>

<body>

	<!-- Page Wrapper -->
	<div class="page-wrapper">

		<!-- Header -->
		<header id="header" class="header header-one clearfix">
			<div class="container">
				<div class="row">
					<div class="col-xs-6 col-sm-4 col-lg-3">
						<div class="site-branding">
							<div class="wrap">
								<h1 class="site-title">
									<a href="index.html" rel="home">
										<img src="../images/logo1s.png" alt="Antarctica">
									</a>
								</h1>
							</div>
						</div>
					</div>
					<div class="col-xs-6 col-sm-8 col-lg-9">
						<div class="navigation-top clearfix">
							<nav id="site-navigation" class="main-navigation nv1">
								<ul class="menu-primary clearfix">
									<li>
										<a href="../index.html">首页</a>
									</li>
									<li>
										<a href="../forum.html">论坛</a>
									</li>
									<li>
										<a href="../portfolio.html">MOD搬运</a>
									</li>
									<!-- <li><a href="blog.html">Blog</a></li> -->
									<li>
										<a href="../about-us.html">关于我们</a>
									</li>
									<li>
										<a href="../contact.html">反馈</a>
									</li>
								</ul>
							</nav>


							<nav class="main-navigation nv2">
								<ul class="menu-primary clearfix">
									<!--<li class="login-li">-->
									<!--<button type="button" class="login-btn btn btn-success btn-sm">登陆</button>-->
									<!--</li>-->
									<!--<li>-->
									<!--<a href="#" class="theme-color regist">注册</a>-->
									<!--</li>-->
									<!--<li>-->
									<!--<div class="top-line line-r"></div>-->
									<!--</li>-->
									<li>
										<form action="#" class="header-search-form">
											<input type="text" name="s" id="s" value="" class="search-input" placeholder="Search">
										</form>
									</li>
									<li>
										<a href="">发帖</a>
									</li>
									<li style="overflow: visible">
										<!--消息提醒-->
										<div class="top-message black fa fa-bell-o noselect" unselectable="on">
											<span class="stamp">50</span>
										</div>
										<!--弹出层-->
										<section class="message-panel" style="display: none">
											<div class="triangle1"></div>
											<div class="title">新消息</div>
											<p>
												<i class="fa fa-circle news"></i>
												<span class="message-li1">坎星人 赞了你</span>
												<span class="message-li2">建议发展讨论</span>
											</p>
											<p>
												<i class="fa fa-circle news"></i>
												<span class="message-li1">多巴胺安抚 回复了你：打开mod文件...</span>
												<span class="message-li2">在ksp中如何安装Mod</span>
											</p>
											<a href="" class="bottom">查看更多→</a>
										</section>
									</li>

									<li style="overflow: visible">
										<a href="" class="top-head"><img src="../images/headx-default.png" alt="" width="30" height="30"></a>
										<div class="top-username black noselect" unselectable="on">
											<apan>箭镞大师</apan>
											<i class="fa fa-caret-down"></i>
										</div>
										<!--弹出层-->
										<section class="user-panel" style="display: none">
											<div class="triangle2"></div>
											<p>哈哈打</p>
											<p>纷纷嘎</p>
											<p>牛逼啦</p>
											<p>朝野</p>
											<p class="split-line"></p>
											<p>退出</p>
										</section>
									</li>
								</ul>
							</nav>

						</div>
					</div>
				</div>
			</div>
		</header>
		<!-- Header end -->

		<div class="sub-header forum-head-bg">
			<div class="bg-overlay"></div>
			<div class="container">
				<h2 class="title">大自然的秩序，证明了宇宙确有它的建筑家。</h2>
				<p class="description">——〔德〕康德：《康德文集》</p>
			</div>
		</div>

		<div class="services-page">
			<!-- Main Content -->
			<main id="main" class="main container">
				<!--导航 -->
				<div class="row forum-nav">
					<i class="fa fa-home fa-lg normal-color"></i>
					<a href="" class="normal-color">论坛</a>
					&nbsp;<i class="normal-color">&gt;</i>&nbsp;
					<a href="" class="normal-color">综合</a>
					&nbsp;<i class="normal-color">&gt;</i>&nbsp;
					<a href="" class="normal-color">论坛公告</a>
				</div>

				<div class="top-title">
					<h3 class="new-subject">发表帖子</h3>
				</div>


				<div class="row module-container topic-container">
					<!--<div class="module-title">创建新主题</div>-->
					<main>
						<div class="input-group">
							<label for="topicTitle" class="in-title">标题</label>&nbsp;&nbsp;&nbsp;<span class="must-input">必填</span>
							<input type="text" id="topicTitle" class="form-control" style="width: 500px;" placeholder="请输入标题">
						</div>

						<div class="input-group">
							<label for="topicTag" class="in-title">标签</label>
							<input type="text" value="鱼,猫咪" id="topicTag" class="form-control">
						</div>

						<div class="input-group">
							<span class="must-input">必填</span>
							<div class="replay-area myEditor"></div>
						</div>
						<div class="input-group">
							<button type="button" style="border-radius: 3px;" class="btn btn-warning topic-opr-item"><i class="fa fa-paper-plane-o"></i> 发表帖子</button>
							<div class="checkbox checkbox-slider--b-flat topic-opr-item">
								<label>
									<input type="checkbox"><span>转播给听众</span>
								</label>
							</div>
						</div>
					</main>
				</div>
			</main>
		</div>

		<!-- Footer -->
		<footer id="footer" class="footer">
			<div class="sub-footer text-center">
				<div class="container">
					<p>Copyright &copy; 2017.aesop All rights reserved.</p>
				</div>
			</div>
		</footer>
	</div>

	<!-- Required Plugins and Scripts -->
	<script src="../../static/plugin/jquery-3.1.1.min.js"></script>
	<script src="../plugin/jqueryUi/jquery-ui.min.js"></script>
	<script src="../../static/plugin/jquery-migrate.min.js"></script>
	<script src="../plugin/bootstrap/bootstrap.min.js"></script>
	<script src="../plugin/pagination/jquery.pagination.min.js"></script>
	<script src="../../static/plugin/flexslider/jquery.flexslider-min.js"></script>
	<script src="../plugin/slicknav/jquery.slicknav.min.js"></script>
	<script src="../plugin/editor/wangEditor.js"></script>
	<script src="../plugin/tagInput/jquery.tagsinput-revisited.min.js"></script>

	<!--自定义Js-->
	<script src="../../static/js/common.js"></script>
	<script src="../../static/js/nav.js"></script>
	<script src="../../static/js/forum/topic_new.js"></script>

</body>

</html>