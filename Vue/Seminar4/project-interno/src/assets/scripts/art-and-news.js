const artandnews = new Vue({
  el: '#artandnews',
  data: {
    articles: [
      {
        id: 1,
        tag: 'Kitchan Design',
        title: 'Low Cost Latest Invented Interior Designing<br>Ideas.',
        date: '26 December,2022',
        imglink: '#'
      },
      {
        id: 2,
        tag: 'Living Design',
        title: 'Let’s Get Solution For Building Construction Work',
        date: '22 December,2022',
        imglink: '#'
      },
      {
        id: 3,
        tag: 'Interior Design',
        title: 'Best For Any Office & Business Interior<br>Solution',
        date: '25 December,2022',
        imglink: '#'
      },
      {
        id: 4,
        tag: 'Kitchan Design',
        title: 'Low Cost Latest Invented Interior Designing<br>Ideas.',
        date: '26 December,2022',
        imglink: '#'
      },
      {
        id: 5,
        tag: 'Living Design',
        title: 'Let’s Get Solution For Building Construction Work',
        date: '22 December,2022',
        imglink: '#'
      },
      {
        id: 6,
        tag: 'Interior Design',
        title: 'Best For Any Office & Business Interior<br>Solution',
        date: '25 December,2022',
        imglink: '#'
      }
    ]
  },
  template: `
        <div class="blog__blog"><div class="blog__blog-window" v-for="article in articles">
            <div class="blog__blog_subcontent blog__blog_subcontent-bgColor">
                <div class="blog__blog_content">
                    <div class="blog__blog_content-img blog__blog_content-img2">
                        <div class="blog__blog_content-img_tag">
                            <div class="blog__blog_content-img_tag-rectangle">
                                <div class="blog__blog_content-img_tag-text">
                                    {{ article.tag }}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="blog__blog_content-subcontent">
                        <div class="blog__blog_content-title">
                            {{ article.title }}
                        </div>
                        <div class="blog__blog_content-date">
                            <div class="blog__blog_content-dateText">
                                {{article.date}} 
                            </div>
                            <a href="blog-details.html" class="project__contnet_block-link">
                                <svg width="52" height="53" viewBox="0 0 52 53" fill="none" xmlns="http://www.w3.org/2000/svg"><circle class="blog__blog_subcontent" cx="26" cy="26.2671" r="26" fill="#F4F0EC"/><path d="M23.7715 32.9529L29.7144 26.2672L23.7715 19.5815" stroke="#292F36" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"/></svg>                                     
                            </a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="blog__blog_tag">
            </div>
        </div></div>
    `

})
