<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="productConfig"
	tagdir="/WEB-INF/tags/addons/octsapproductconfigb2baddon/desktop/product"%>
<productConfig:productAddToCartPanel product="${product}" allowAddToCart="${empty showAddToCart ? true : showAddToCart}" isMain="true" />
