<template>
	<div>
		<nav class="bg-white shadow-md sticky w-full z-10">
			<div class="container mx-auto px-4 sm:px-6 lg:px-8">
				<div class="flex justify-between items-center py-4">
					<!-- Logo -->
					<div class="text-2xl font-bold text-gray-800">MyLogo</div>
					<!-- Hamburger Menu (for mobile) -->
					<div class="sm:hidden">
						<button @click="menuDisply" id="menu-btn" class="text-gray-800 focus:outline-none">
							<svg
								class="w-6 h-6"
								fill="none"
								stroke="currentColor"
								viewBox="0 0 24 24"
								xmlns="http://www.w3.org/2000/svg"
							>
								<path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M4 6h16M4 12h16m-7 6h7"></path>
							</svg>
						</button>
					</div>
					<!-- Navigation Links (hidden on small screens) -->
					<div class="hidden sm:flex space-x-8 text-gray-800">
						<RouterLink class="hover:text-blue-500" to="/">Home</RouterLink>
						<RouterLink class="hover:text-blue-500" to="/about">About</RouterLink>
						<RouterLink class="hover:text-blue-500" to="/month">Month</RouterLink>
						<RouterLink class="hover:text-blue-500" to="/login">Login</RouterLink>
						<RouterLink class="hover:text-blue-500" to="/message">Message</RouterLink>
					</div>
				</div>
				<!-- Mobile Menu (hidden by default) -->
				<div id="mobile-menu" class="hidden sm:hidden bg-white">
					<RouterLink class="block px-4 py-2 text-gray-800 hover:bg-gray-100" to="/">Home</RouterLink>
					<RouterLink class="block px-4 py-2 text-gray-800 hover:bg-gray-100" to="/about">About</RouterLink>
					<RouterLink class="block px-4 py-2 text-gray-800 hover:bg-gray-100" to="/month">Month</RouterLink>
					<RouterLink class="block px-4 py-2 text-gray-800 hover:bg-gray-100" to="/login">Login</RouterLink>
					<RouterLink class="block px-4 py-2 text-gray-800 hover:bg-gray-100" to="/message">Message</RouterLink>
				</div>
			</div>
		</nav>
	</div>
</template>

<script setup>
const menuDisply = () => {
	const menu = document.getElementById('mobile-menu');
	menu.classList.toggle('hidden');
};
</script>

<style lang="scss" scoped></style>
