$(document).ready( function () {
	 var table = $('#dataTable').DataTable({
			"sAjaxSource": "/doctors",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			    { "mData": "id"},
		      { "mData": "name" },
				  { "mData": "department" },
				  { "mData": "specialty" }
			]
	 })
});
