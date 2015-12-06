$(function() {

	/*
	 * 公告栏
	 */
	$('#module_board').click(function() {
		/*
		 * 删除样式再增加样式
		 */
		$('#module div').attr('class', 'html-module-div');
		$('#module_board').attr('class', 'html-module-div-checked');

		if ($('#content').tabs('exists', '公告栏')) {
			$('#content').tabs('select', '公告栏');
		} else {
			$(this).attr('class', 'html-module-div-checked');
			$('#content').tabs('add', {
				title : '公告栏',
				href : 'html/datagrid-board.html',
			});
		}
	});

	/*
	 * 用户管理
	 */
	$('#module_user').click(function() {
		/*
		 * 删除样式再增加样式
		 */
		$('#module div').attr('class', 'html-module-div');
		$('#module_user').attr('class', 'html-module-div-checked');

		if ($('#content').tabs('exists', '用户管理')) {
			$('#content').tabs('select', '用户管理');
		} else {
			$('#content').tabs('add', {
				title : '用户管理',
				href : 'html/datagrid-user.html',
				closable : true
			});
		}
	});

	/*
	 * 图书管理
	 */
	$('#module_book').click(function() {
		/*
		 * 删除样式再增加样式
		 */
		$('#module div').attr('class', 'html-module-div');
		$('#module_book').attr('class', 'html-module-div-checked');

		if ($('#content').tabs('exists', '图书管理')) {
			$('#content').tabs('select', '图书管理');
		} else {
			$(this).attr('class', 'html-module-div-checked');
			$('#content').tabs('add', {
				title : '图书管理',
				closable : true
			});
		}
	});
	
	/*
	 * 权限设置
	 */
	$('#module_permission').click(function() {
		/*
		 * 删除样式再增加样式
		 */
		$('#module div').attr('class', 'html-module-div');
		$('#module_permission').attr('class', 'html-module-div-checked');

		if ($('#content').tabs('exists', '权限管理')) {
			$('#content').tabs('select', '权限管理');
		} else {
			$(this).attr('class', 'html-module-div-checked');
			$('#content').tabs('add', {
				title : '权限管理',
				closable : true
			});
		}
	});
	
	/*
	 * 系统日志
	 */
	$('#module_log').click(function() {
		/*
		 * 删除样式再增加样式
		 */
		$('#module div').attr('class', 'html-module-div');
		$('#module_log').attr('class', 'html-module-div-checked');

		if ($('#content').tabs('exists', '系统日志')) {
			$('#content').tabs('select', '系统日志');
		} else {
			$(this).attr('class', 'html-module-div-checked');
			$('#content').tabs('add', {
				title : '系统日志',
				closable : true
			});
		}
	});
});