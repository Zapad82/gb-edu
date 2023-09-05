<template>
  <div>
    <div class="container">
      <div class="header">
        <div class="header__left">
          <div class="header__left_block-logo">
            <a href="index.html">
              <img
                src="../../assets/img/logos/Logo.png"
                alt="Logo"
                class="logo"
              >
            </a>
            <a
              href="index.html"
              class="siteName"
            >
              Interno
            </a>
          </div>
        </div>
        <div class="header__right">
          <div class="header__menu">
            <router-link
              to="/"
              class="header__menu_link"
            >
              Home
            </router-link>
            <router-link
              to="/blog"
              class="header__menu_link"
            >
              Blog
            </router-link>
            <router-link
              to="/project"
              class="header__menu_link"
            >
              Project
            </router-link>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>

export default {
  name: 'HeaderBlock',
  components: {

  }
}
</script>

<style lang="sass" module>
</style>
