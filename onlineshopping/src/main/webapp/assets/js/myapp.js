$(function() {
	// solving the active menu problem
	switch(menu) {
	
		case 'About Us':
			$('#about').addClass('active');
			break;
		case 'Contact Us':
			$('#contact').addClass('active');
			break;
//		case 'All Products':
//			$('#listProducts').addClass('active');
//			break;
//		case 'Manage Products':
//			$('#manageProducts').addClass('active');
//			break;
//		case 'User Cart':
//			$('#userCart').addClass('active');
//			break;
		default:
			$('#home').addClass('active');
//			if(menu == "Home") break;
//			$('#listProducts').addClass('active');
//			$('#a_'+menu).addClass('active');
			break;		
	}
});