<h1>Users/Groups in the AEM JCR are : </h1>
<sly
	data-sly-use.object="com.adobe.aem.guides.reddy.core.cqcomponents.UserComponent" />
<div>
	<h2>Users</h2>
	<ol data-sly-list="${object.users}">
		<li>${item}</li>
	</ol>
	<h2>Groups</h2>
	<ol data-sly-list="${object.groups}">
		<li>${item}</li>
	</ol>
</div>