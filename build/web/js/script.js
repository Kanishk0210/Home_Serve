const { Table } = antd;

const columns = [{
  title: 'Service Name',
  dataIndex: 'title' },
  

{
  title: 'Service Charge',
  dataIndex: 'price' },
  {
  title: 'Remark',
  dataIndex: 'remark' },

{
  title: 'Total',
  dataIndex: 'total' }];


const data = [{
  key: '1',
  title: '',
  price: '',
  tax: '',
  total: '' },
];



function Invoice() {
  return (
    React.createElement("div", { className: "invoice" },
    React.createElement("div", { className: "invoice-content" },
    React.createElement("div", { className: "invoice-header" },
    React.createElement("h1", { className: "invoice-header-text" }, "Invoice")),

    React.createElement("div", { className: "invoice-info" },
    React.createElement("div", null, "Booking Id"),


    React.createElement("div", null, "July 15th, 2019")
    ),



    React.createElement("div", { className: "invoice-company" },
    React.createElement("div", { className: "invoice-company-info" },
    React.createElement("span", null, "Home Services"),
    //React.createElement("span", null, "Department of State"),
    //React.createElement("span", null, "2050 Bamako Place"),
    //React.createElement("span", null, "Washington, DC 20521-2050")
    ),

    React.createElement("div", { className: "invoice-company-logo" },
    React.createElement("img", { src: "logo.png", width: "230px",height:"100px" }))),



    React.createElement("h2", { className: "invoice-month-header" }, "July 2019"),

    React.createElement(Table, {
      columns: columns,
      dataSource: data,
      pagination: false,
      bordered: true,
      className: "invoice-table",
      size: "middle" }),

   
    React.createElement("div", { className: "invoice-total" },
    React.createElement("h2", null, "Total"),
    React.createElement("h2", null, "0")),


    React.createElement("footer", null,
    React.createElement("h3", null,
  )))));






}

ReactDOM.render(React.createElement(Invoice, null), document.getElementById('container'));