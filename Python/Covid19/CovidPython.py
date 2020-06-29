#/usr/bin/env python
# coding: utf-8

# In[1]:





# In[2]:


import pandas as pd 




# In[81]:


import matplotlib.pyplot as plt


# In[5]:


from matplotlib import style
style.use('ggplot')
get_ipython().run_line_magic('matplotlib', 'inline')





# In[59]:


import plotly
import plotly.express as px
import plotly.graph_objects as go
plt.rcParams['figure.figsize']=17,8
import plotly.offline as pyo





# In[9]:


import cufflinks as cf
from plotly.offline import init_notebook_mode,plot,iplot





# In[11]:


import folium


# In[12]:


pyo.init_notebook_mode(connected = True)
cf.go_offline()




# In[23]:


df=pd.read_excel("CovidIndia.xlsx")
# https://www.kaggle.com/sudalairajkumar/novel-corona-virus-2019-dataset/data
# https://brasil.io/dataset/covid19/caso


# In[53]:


df


# In[25]:


df.drop(['S. No.'],axis=1, inplace =True)
# drop serve pra esconder atributos da tabela
# inplace arranca atributos da tabela permanentemente


# In[54]:


df ['Total Cases']= df['Total Confirmed cases (Indian National)']+df['Total Confirmed cases ( Foreign National )']


# In[31]:


totalCasesOverall = df['Total Cases'].sum()
print('The Total cases till now in India is', totalCasesOverall )


# In[32]:


df['Active Cases'] = df['Total Cases'] - (df['Death'] + df['Cured'])


# In[55]:


df


# In[56]:


df.style.background_gradient(cmap='Reds')


# In[43]:


totalActiveCases = df.groupby('Name of State / UT')['Active Cases'].sum().sort_values(ascending = False).to_frame()
# Agrupa duas colunas selecionadas somando as, classifica os valores e 'to_frame()' melhora visualmente 


# In[57]:


totalActiveCases.style.background_gradient(cmap = 'Reds')


# In[49]:


# Representação Gráfica #


# In[77]:


# Visual Pandas
df.plot(kind = 'bar', x = 'Name of State / UT', y = 'Total Cases')
# plt.show()


# In[78]:


#Plotly
df.iplot(kind='bar',x='Name of State / UT',y='Total Cases')


# In[ ]:


# Visual Matplotlib
plt.bar(df['Name of State / UT'],df['Total Cases'])

